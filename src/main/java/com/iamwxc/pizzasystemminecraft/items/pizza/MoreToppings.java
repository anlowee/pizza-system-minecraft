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
public class MoreToppings extends ItemStack {

    public MoreToppings() {
        this.setType(Material.CAKE);
        this.setAmount(1);
        ItemMeta meta = this.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§l更多配料");
        List<String> lore = new ArrayList<>();
        lore.add("根据您选择的披萨加入更多配料");
        meta.setLore(lore);
        meta.setLocalizedName("More Toppings");
        this.setItemMeta(meta);
    }

}
