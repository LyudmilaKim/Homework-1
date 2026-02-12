package com.narxoz.rpg.equipment.magic;

import com.narxoz.rpg.equipment.Weapon;

public class WizardStaff implements Weapon {
    @Override
    public String getName() {
        return "Wizard Staff";
    }

    @Override
    public int getDamage() {
        return 15;
    }

    @Override
    public String getDescription() {
        return "Wizard Staff (damage: 15, +mana regeneration)";
    }
}