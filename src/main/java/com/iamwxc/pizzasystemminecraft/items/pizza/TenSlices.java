package com.iamwxc.pizzasystemminecraft.items.pizza;

import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
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
public class TenSlices extends ItemStack {

    public TenSlices() {
        this.setType(Material.IRON_AXE);
        this.setAmount(1);
        ItemMeta meta = this.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§l切成10片");
        List<String> lore = new ArrayList<>();
        lore.add("切成10片");
        meta.setLore(lore);
        meta.setLocalizedName("10 Slices");
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        this.setItemMeta(meta);
    }

}
