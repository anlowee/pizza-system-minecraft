package com.iamwxc.pizzasystemminecraft.events;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iamwxc.pizzasystemminecraft.inventories.BeverageAdditionsSelection;
import com.iamwxc.pizzasystemminecraft.inventories.PizzaAdditionsSelection;
import com.iamwxc.pizzasystemminecraft.inventories.FoodTypeSelection;
import com.iamwxc.pizzasystemminecraft.items.pizza.Receipt;
import com.iamwxc.pizzasystemminecraft.order.*;
import okhttp3.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.meta.ItemMeta;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/26
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/26
 */
public class PizzaAdditionsSelectListener implements Listener {

    @EventHandler
    public void onAdditionSelect(InventoryClickEvent event) throws IOException {
        if (event.getClickedInventory() == null) {
            return;
        }
        if (event.getClickedInventory().getHolder() instanceof PizzaAdditionsSelection
        || event.getClickedInventory().getHolder() instanceof BeverageAdditionsSelection) {
            event.setCancelled(true);
            Player player = (Player) event.getWhoClicked();
            if (event.getCurrentItem() == null) {
                return;
            }
            player.sendMessage("§2§l" + player.getName() + " 点了 " + event.getCurrentItem().getItemMeta().getDisplayName());
            Order order = PlayerOrderMapper.getInstance().getPlayerOrderMap().get(player);
            if (event.getCurrentItem().getItemMeta().getLocalizedName().equals("EndOrder")) {
                player.sendMessage("§2§l" + player.getName() + " 提交了订单");
                player.closeInventory();
                addToBaseOrder(order);

                PlayerOrderMapper.getInstance().getPlayerOrderMap().put(player, null);
                player.getInventory().remove(player.getInventory().getItemInMainHand());
                getReceipt(player, sendRequest(order));
                return;
            } else {
                if (event.getCurrentItem().getItemMeta().getLocalizedName().equals("AnotherOrder")) {
                    player.sendMessage("§2§l" + player.getName() + " 继续点其他商品");
                    player.closeInventory();
                    addToBaseOrder(order);
                    player.openInventory(new FoodTypeSelection().getInventory());
                    return;
                }
            }
            order.getCurrentOrder().getAdditions().add(event.getCurrentItem().getItemMeta().getLocalizedName());
        }
    }

    private void getReceipt(Player player, String str) {
        Receipt receipt = new Receipt();
        ItemMeta meta = receipt.getItemMeta();
        List<String> lore = new ArrayList<>();
        lore.add("PizzaCat-意式披萨店");
        lore.add(new Date().toString());
        meta.setLore(lore);
        receipt.setItemMeta(meta);
        receipt.setDetails(str);
        player.sendMessage(str);
        player.getInventory().addItem(receipt);
    }

    private String sendRequest(Order order) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(order);
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, json);
        Request request = new Request.Builder()
                .url("http://49.235.232.153:8080/api/italy/order")
                .method("POST", body)
                .addHeader("Content-Type", "application/json")
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    private void addToBaseOrder(Order order) {
        switch (order.getCurrentOrder().getType()) {
            case "Pepperoni":
            case "Cheese":
                order.getPizzas().add(order.getCurrentOrder());
                break;
            case "Coffee":
            case "Milk Tea":
                order.getBeverages().add(order.getCurrentOrder());
                break;
            default:
                break;
        }
    }

}
