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
public class Dine extends ItemStack {

    public Dine() {
        this.setType(Material.BOWL);
        this.setAmount(1);
        ItemMeta meta = this.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§l堂食");
        List<String> lore = new ArrayList<>();
        lore.add("疫情期间希望您尽可能选择外带");
        meta.setLore(lore);
        meta.setLocalizedName("Dine");
        this.setItemMeta(meta);
    }

}
