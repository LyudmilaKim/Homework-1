package com.narxoz.rpg.equipment.ranger;

import com.narxoz.rpg.equipment.Armor;

public class LeatherArmor implements Armor {
    @Override
    public String getName() {
        return "Leather Armor";
    }

    @Override
    public int getDefense() {
        return 20;
    }

    @Override
    public String getDescription() {
        return "Leather Armor (defense: 20, high mobility)";
    }
}