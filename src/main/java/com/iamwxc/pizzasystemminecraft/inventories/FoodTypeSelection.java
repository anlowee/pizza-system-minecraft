package com.iamwxc.pizzasystemminecraft.inventories;

import com.iamwxc.pizzasystemminecraft.items.beverage.CoffeeTypeBeverage;
import com.iamwxc.pizzasystemminecraft.items.beverage.MilkTeaTypeBeverage;
import com.iamwxc.pizzasystemminecraft.items.pizza.CheeseTypePizza;
import com.iamwxc.pizzasystemminecraft.items.pizza.PepperoniTypePizza;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/26
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/26
 */
public class FoodTypeSelection implements InventoryHolder {

    private final Inventory inventory;

    public FoodTypeSelection() {
        inventory = Bukkit.createInventory(this, 9, "选择商品");
        inventory.addItem(new PepperoniTypePizza());
        inventory.addItem(new CheeseTypePizza());
        inventory.addItem(new CoffeeTypeBeverage());
        inventory.addItem(new MilkTeaTypeBeverage());
    }

    @Override
    public Inventory getInventory() {
        return inventory;
    }
}
