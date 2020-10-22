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
public class Whip extends ItemStack {

    public Whip() {
        this.setType(Material.CAKE);
        this.setAmount(1);
        ItemMeta meta = this.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§l奶盖");
        List<String> lore = new ArrayList<>();
        lore.add("使用鲜奶油制作");
        meta.setLore(lore);
        meta.setLocalizedName("Whip");
        this.setItemMeta(meta);
    }

}
