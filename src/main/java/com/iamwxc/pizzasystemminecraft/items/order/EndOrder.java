package com.iamwxc.pizzasystemminecraft.items.order;

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
public class EndOrder extends ItemStack {

    public EndOrder() {
        this.setType(Material.PAPER);
        this.setAmount(1);
        ItemMeta meta = this.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§l提交点单");
        List<String> lore = new ArrayList<>();
        lore.add("点单完成，提交点单");
        meta.setLore(lore);
        meta.setLocalizedName("EndOrder");
        this.setItemMeta(meta);
    }

}
