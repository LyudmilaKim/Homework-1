package com.narxoz.rpg.factory.equipment;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.ranger.Longbow;
import com.narxoz.rpg.equipment.ranger.LeatherArmor;

public class RangerEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new Longbow();
    }

    @Override
    public Armor createArmor() {
        return new LeatherArmor();
    }
}