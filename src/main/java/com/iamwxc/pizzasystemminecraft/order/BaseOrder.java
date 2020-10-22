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
public class BaseOrder {

    private String type;
    private List<String> additions = new ArrayList<>();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getAdditions() {
        return additions;
    }

    public void setAdditions(List<String> additions) {
        this.additions = additions;
    }
}
