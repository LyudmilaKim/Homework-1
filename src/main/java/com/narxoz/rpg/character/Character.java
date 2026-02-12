package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public interface Character {
    String getName();
    int getHealth();
    int getMana();
    int getStrength();
    int getIntelligence();

    String getSpecialAbility();

    void equipWeapon(Weapon weapon);
    void equipArmor(Armor armor);

    String getStats();
    String getEquipmentInfo();
}