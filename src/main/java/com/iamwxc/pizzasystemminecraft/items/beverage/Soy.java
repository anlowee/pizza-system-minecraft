package com.iamwxc.pizzasystemminecraft.items.beverage;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/27
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/27
 */
public class Soy extends ItemStack {

    public Soy() {
        this.setType(Material.POTATO);
        this.setAmount(1);
        ItemMeta meta = this.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§l更多豆浆");
        List<String> lore = new ArrayList<>();
        lore.add("现磨大豆");
        meta.setLore(lore);
        meta.setLocalizedName("Soy");
        this.setItemMeta(meta);
    }

}
