package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public class Mage implements Character {
    private final String name;
    private Weapon weapon;
    private Armor armor;

    public Mage(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHealth() {
        return 80;
    }

    @Override
    public int getMana() {
        return 150;
    }

    @Override
    public int getStrength() {
        return 20;
    }

    @Override
    public int getIntelligence() {
        return 90;
    }

    @Override
    public String getSpecialAbility() {
        return "Arcane Blast - powerful magical attack";
    }

    @Override
    public void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void equipArmor(Armor armor) {
        this.armor = armor;
    }

    @Override
    public String getStats() {
        return String.format(
                "%s (Mage)\n" +
                        "  Health: %d    Mana: %d\n" +
                        "  Strength: %d   Intelligence: %d\n" +
                        "  Special: %s",
                name, getHealth(), getMana(), getStrength(), getIntelligence(), getSpecialAbility()
        );
    }

    @Override
    public String getEquipmentInfo() {
        String w = weapon != null ? weapon.getDescription() : "no weapon";
        String a = armor != null ? armor.getDescription() : "no armor";
        return "Weapon: " + w + "\nArmor:  " + a;
    }
}