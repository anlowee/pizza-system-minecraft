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
public class Milk extends ItemStack {

    public Milk() {
        this.setType(Material.MILK_BUCKET);
        this.setAmount(1);
        ItemMeta meta = this.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§l加牛奶");
        List<String> lore = new ArrayList<>();
        lore.add("不兑水的牛奶");
        meta.setLore(lore);
        meta.setLocalizedName("Milk");
        this.setItemMeta(meta);
    }

}
