package com.iamwxc.pizzasystemminecraft.items.pizza;

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
public class TakeOut extends ItemStack {

    public TakeOut() {
        this.setType(Material.CHEST);
        this.setAmount(1);
        ItemMeta meta = this.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§l外带");
        List<String> lore = new ArrayList<>();
        lore.add("使用环保纸盒");
        meta.setLore(lore);
        meta.setLocalizedName("Take Out");
        this.setItemMeta(meta);
    }

}
