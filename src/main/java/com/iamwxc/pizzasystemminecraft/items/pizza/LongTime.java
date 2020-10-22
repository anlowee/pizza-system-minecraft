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
public class LongTime extends ItemStack {

    public LongTime() {
        this.setType(Material.CLOCK);
        this.setAmount(1);
        ItemMeta meta = this.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§l长时间烘烤");
        List<String> lore = new ArrayList<>();
        lore.add("烘烤更长时间，更加酥脆");
        meta.setLore(lore);
        meta.setLocalizedName("Long Time");
        this.setItemMeta(meta);
    }

}
