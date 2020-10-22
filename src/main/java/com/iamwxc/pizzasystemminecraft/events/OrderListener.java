package com.iamwxc.pizzasystemminecraft.events;

import com.iamwxc.pizzasystemminecraft.inventories.FoodTypeSelection;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.Objects;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/26
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/26
 */
public class OrderListener implements Listener {

    @EventHandler
    public void onOrder(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            Player player = event.getPlayer();
            if ("OrderEntity".equals(Objects.requireNonNull(player.getInventory().getItemInMainHand().getItemMeta()).getLocalizedName())) {
                player.openInventory(new FoodTypeSelection().getInventory());
            }
        }
    }

}
