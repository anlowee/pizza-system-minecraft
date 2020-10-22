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
public class HighTemperature extends ItemStack {

    public HighTemperature() {
        this.setType(Material.FIRE);
        this.setAmount(1);
        ItemMeta meta = this.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§l高温烘烤");
        List<String> lore = new ArrayList<>();
        lore.add("330摄氏度高温烘烤，更加入味");
        meta.setLore(lore);
        meta.setLocalizedName("High Temperature");
        this.setItemMeta(meta);
    }

}
