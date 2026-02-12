package com.narxoz.rpg.equipment.ranger;

import com.narxoz.rpg.equipment.Weapon;

public class Longbow implements Weapon {
    @Override
    public String getName() {
        return "Longbow";
    }

    @Override
    public int getDamage() {
        return 28;
    }

    @Override
    public String getDescription() {
        return "Longbow (damage: 28, long range)";
    }
}