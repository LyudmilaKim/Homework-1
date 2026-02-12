package com.narxoz.rpg.equipment.magic;

import com.narxoz.rpg.equipment.Armor;

public class EnchantedRobes implements Armor {
    @Override
    public String getName() {
        return "Enchanted Robes";
    }

    @Override
    public int getDefense() {
        return 12;
    }

    @Override
    public String getDescription() {
        return "Enchanted Robes (defense: 12, +mana pool)";
    }
}