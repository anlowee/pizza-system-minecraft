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
public class MorePepperoni extends ItemStack {

    public MorePepperoni() {
        this.setType(Material.PORKCHOP);
        this.setAmount(1);
        ItemMeta meta = this.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§l更多香肠");
        List<String> lore = new ArrayList<>();
        lore.add("意式披萨店特色服务：更多香肠");
        meta.setLore(lore);
        meta.setLocalizedName("More Pepperoni");
        this.setItemMeta(meta);
    }

}
