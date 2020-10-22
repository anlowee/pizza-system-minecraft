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
public class MoreCheese extends ItemStack {

    public MoreCheese() {
        this.setType(Material.SPONGE);
        this.setAmount(1);
        ItemMeta meta = this.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§l更多芝士");
        List<String> lore = new ArrayList<>();
        lore.add("披萨中会加入更多芝士");
        meta.setLore(lore);
        meta.setLocalizedName("More Cheese");
        this.setItemMeta(meta);
    }

}
