package com.iamwxc.pizzasystemminecraft.order;

import com.iamwxc.pizzasystemminecraft.items.pizza.Receipt;

import java.util.HashMap;
import java.util.Map;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/27
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/27
 */
public class ReceiptMapper {

    private volatile static ReceiptMapper uniqueInstance;

    private Map<Receipt, String> receiptStringMap = new HashMap<>();

    private ReceiptMapper() {}

    public static ReceiptMapper getInstance() {
        if (uniqueInstance == null) {
            synchronized (PlayerOrderMapper.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new ReceiptMapper();
                }
            }
        }
        return uniqueInstance;
    }

    public Map<Receipt, String> getReceiptStringMap() {
        return receiptStringMap;
    }

    public void setReceiptStringMap(Map<Receipt, String> receiptStringMap) {
        this.receiptStringMap = receiptStringMap;
    }
}
