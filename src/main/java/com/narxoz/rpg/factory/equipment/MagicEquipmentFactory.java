package com.narxoz.rpg.factory.equipment;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.magic.WizardStaff;
import com.narxoz.rpg.equipment.magic.EnchantedRobes;

public class MagicEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new WizardStaff();
    }

    @Override
    public Armor createArmor() {
        return new EnchantedRobes();
    }
}