package com.iamwxc.pizzasystemminecraft.order;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/26
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/26
 */
public class OrderEntity extends ItemStack {

    public OrderEntity() {
        this.setType(Material.ENCHANTED_BOOK);
        this.setAmount(1);
        ItemMeta meta = this.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§l您的订单");
        List<String> lore = new ArrayList<>();
        lore.add("您的订单记录在此，请把它拿在手上");
        meta.setLore(lore);
        meta.setLocalizedName("OrderEntity");
        this.setItemMeta(meta);
    }

}
