package com.iamwxc.pizzasystemminecraft.inventories;

import com.iamwxc.pizzasystemminecraft.items.order.AnotherOrder;
import com.iamwxc.pizzasystemminecraft.items.order.EndOrder;
import com.iamwxc.pizzasystemminecraft.items.pizza.*;
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
public class PizzaAdditionsSelection implements InventoryHolder {

    private final Inventory inventory;

    public PizzaAdditionsSelection() {
        inventory = Bukkit.createInventory(this, 18, "自定义披萨");
        inventory.addItem(new LargeSize());
        inventory.addItem(new MoreCheese());
        inventory.addItem(new MoreSauce());
        inventory.addItem(new MoreToppings());
        inventory.addItem(new MorePepperoni());
        inventory.addItem(new HighTemperature());
        inventory.addItem(new LongTime());
        inventory.addItem(new TenSlices());
        inventory.addItem(new TwelveSlices());
        inventory.addItem(new Dine());
        inventory.addItem(new TakeOut());
        inventory.addItem(new AnotherOrder());
        inventory.addItem(new EndOrder());
    }

    @Override
    public Inventory getInventory() {
        return inventory;
    }
}
