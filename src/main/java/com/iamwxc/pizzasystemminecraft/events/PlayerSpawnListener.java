package com.iamwxc.pizzasystemminecraft.events;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/27
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/27
 */
public class PlayerSpawnListener implements Listener {

    @EventHandler
    public void onPlayerSpawn(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        Double x = -258.75;
        Double y = 72.000;
        Double z = 601.148;
        Location location = new Location(player.getWorld(), x, y, z);
        player.teleport(location);
        player.sendMessage(ChatColor.RED + "一位顾客进入了PizzaCat-意式披萨店");
    }

}
