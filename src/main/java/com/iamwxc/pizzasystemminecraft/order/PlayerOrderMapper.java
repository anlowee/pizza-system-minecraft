package com.iamwxc.pizzasystemminecraft.order;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/26
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/26
 */
public class PlayerOrderMapper {

    private volatile static PlayerOrderMapper uniqueInstance;

    private Map<Player, Order> playerOrderMap = new HashMap<>();

    public Map<Player, Order> getPlayerOrderMap() {
        return playerOrderMap;
    }

    public void setPlayerOrderMap(Map<Player, Order> playerOrderMap) {
        this.playerOrderMap = playerOrderMap;
    }

    private PlayerOrderMapper() {}

    public static PlayerOrderMapper getInstance() {
        if (uniqueInstance == null) {
            synchronized (PlayerOrderMapper.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new PlayerOrderMapper();
                }
            }
        }
        return uniqueInstance;
    }

}
