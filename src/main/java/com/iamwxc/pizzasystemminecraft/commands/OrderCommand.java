package com.iamwxc.pizzasystemminecraft.commands;

import com.iamwxc.pizzasystemminecraft.order.OrderEntity;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/26
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/26
 */
public class OrderCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use that command!");
            return true;
        }

        Player player = (Player) sender;
        if (command.getName().equalsIgnoreCase("order")) {
            player.sendMessage("开始点餐");
            player.getInventory().addItem(new OrderEntity());
        }

        return true;
    }
}
