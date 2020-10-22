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
public class VentiSize extends ItemStack {

    public VentiSize() {
        this.setType(Material.BUCKET);
        this.setAmount(1);
        ItemMeta meta = this.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§l大杯");
        List<String> lore = new ArrayList<>();
        lore.add("超大量的大杯");
        meta.setLore(lore);
        meta.setLocalizedName("Venti Size");
        this.setItemMeta(meta);
    }

}
