package com.iamwxc.pizzasystemminecraft.events;

import com.iamwxc.pizzasystemminecraft.inventories.BeverageAdditionsSelection;
import com.iamwxc.pizzasystemminecraft.inventories.PizzaAdditionsSelection;
import com.iamwxc.pizzasystemminecraft.inventories.FoodTypeSelection;
import com.iamwxc.pizzasystemminecraft.order.BaseOrder;
import com.iamwxc.pizzasystemminecraft.order.Order;
import com.iamwxc.pizzasystemminecraft.order.PlayerOrderMapper;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/26
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/26
 */
public class FoodTypeSelectListener implements Listener {

    @EventHandler
    public void onPizzaTypeSelect(InventoryClickEvent event) {
        if (event.getClickedInventory() == null) {
            return;
        }
        if (event.getClickedInventory().getHolder() instanceof FoodTypeSelection) {
            event.setCancelled(true);
            Player player = (Player) event.getWhoClicked();
            if (event.getCurrentItem() == null) {
                return;
            }
            player.sendMessage("§2§l" + player.getName() + " 点了 " + event.getCurrentItem().getItemMeta().getDisplayName());
            String type = event.getCurrentItem().getItemMeta().getLocalizedName();
            if (player.getInventory().getItemInMainHand().getItemMeta().getLocalizedName().equals("OrderEntity")) {
                if (PlayerOrderMapper.getInstance().getPlayerOrderMap().get(player) == null) {
                    Order order = new Order();
                    order.setCurrentOrder(new BaseOrder());
                    order.getCurrentOrder().setType(type);
                    PlayerOrderMapper.getInstance().getPlayerOrderMap().put(player, order);
                } else {
                    Order order = PlayerOrderMapper.getInstance().getPlayerOrderMap().get(player);
                    order.setCurrentOrder(new BaseOrder());
                    order.getCurrentOrder().setType(type);
                }
                player.closeInventory();
            }
            switch (type) {
                case "Pepperoni":
                case "Cheese":
                    player.openInventory(new PizzaAdditionsSelection().getInventory());
                    break;
                case "Coffee":
                case "Milk Tea":
                    player.openInventory(new BeverageAdditionsSelection().getInventory());
                default:
                    break;
            }
        }
    }

}
