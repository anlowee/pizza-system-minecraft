package com.iamwxc.pizzasystemminecraft.items.pizza;

import org.bukkit.ChatColor;
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
public class PepperoniTypePizza extends ItemStack {

    public PepperoniTypePizza() {
        this.setType(Material.PORKCHOP);
        this.setAmount(1);
        ItemMeta meta = this.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§l香肠披萨");
        List<String> lore = new ArrayList<>();
        lore.add("使用意式香肠制作");
        meta.setLore(lore);
        meta.setLocalizedName("Pepperoni");
        this.setItemMeta(meta);
    }

}
