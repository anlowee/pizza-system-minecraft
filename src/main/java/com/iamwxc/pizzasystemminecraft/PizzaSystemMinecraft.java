package com.iamwxc.pizzasystemminecraft;

import com.iamwxc.pizzasystemminecraft.commands.OrderCommand;
import com.iamwxc.pizzasystemminecraft.events.OrderListener;
import com.iamwxc.pizzasystemminecraft.events.PizzaAdditionsSelectListener;
import com.iamwxc.pizzasystemminecraft.events.FoodTypeSelectListener;
import com.iamwxc.pizzasystemminecraft.events.PlayerSpawnListener;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class PizzaSystemMinecraft extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("order").setExecutor(new OrderCommand());
        getServer().getPluginManager().registerEvents(new OrderListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerSpawnListener(), this);
        getServer().getPluginManager().registerEvents(new FoodTypeSelectListener(), this);
        getServer().getPluginManager().registerEvents(new PizzaAdditionsSelectListener(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "Pizza Plugin is on enable...");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "Pizza Plugin is on disable...");
    }
}
