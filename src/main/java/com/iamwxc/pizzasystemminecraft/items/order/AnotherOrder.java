package com.iamwxc.pizzasystemminecraft.items.order;

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
public class AnotherOrder extends ItemStack {

    public AnotherOrder() {
        this.setType(Material.PAPER);
        this.setAmount(1);
        ItemMeta meta = this.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§l再点一份其他商品");
        List<String> lore = new ArrayList<>();
        lore.add("返回首页，点其他商品");
        meta.setLore(lore);
        meta.setLocalizedName("AnotherOrder");
        this.setItemMeta(meta);
    }

}
