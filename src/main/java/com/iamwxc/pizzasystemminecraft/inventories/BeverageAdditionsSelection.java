package com.iamwxc.pizzasystemminecraft.inventories;

import com.iamwxc.pizzasystemminecraft.items.order.AnotherOrder;
import com.iamwxc.pizzasystemminecraft.items.order.EndOrder;
import com.iamwxc.pizzasystemminecraft.items.beverage.*;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/27
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/27
 */
public class BeverageAdditionsSelection implements InventoryHolder {

    private final Inventory inventory;

    public BeverageAdditionsSelection() {
        inventory = Bukkit.createInventory(this, 9, "自定义饮料");
        inventory.addItem(new Milk());
        inventory.addItem(new Mocha());
        inventory.addItem(new Soy());
        inventory.addItem(new Whip());
        inventory.addItem(new TallSize());
        inventory.addItem(new VentiSize());
        inventory.addItem(new AnotherOrder());
        inventory.addItem(new EndOrder());
    }

    @NotNull
    @Override
    public Inventory getInventory() {
        return inventory;
    }
}
