package com.iamwxc.pizzasystemminecraft.order;

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
public class Order {

    private List<BaseOrder> pizzas = new ArrayList<>();
    private List<BaseOrder> beverages = new ArrayList<>();

    private BaseOrder currentOrder;

    public BaseOrder getCurrentOrder() {
        return currentOrder;
    }

    public void setCurrentOrder(BaseOrder currentOrder) {
        this.currentOrder = currentOrder;
    }

    public List<BaseOrder> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<BaseOrder> pizzas) {
        this.pizzas = pizzas;
    }

    public List<BaseOrder> getBeverages() {
        return beverages;
    }

    public void setBeverages(List<BaseOrder> beverages) {
        this.beverages = beverages;
    }

}
