package com.narxoz.rpg;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.character.Warrior;
import com.narxoz.rpg.character.Mage;
import com.narxoz.rpg.character.Archer;
import com.narxoz.rpg.factory.character.*;
import com.narxoz.rpg.factory.equipment.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG Demo with both patterns ===\n");

        CharacterFactory warriorFactory = new WarriorFactory();
        CharacterFactory mageFactory    = new MageFactory();
        CharacterFactory archerFactory  = new ArcherFactory();

        Character arthur  = warriorFactory.createCharacter("Arthur");
        Character elara   = mageFactory.createCharacter("Elara");
        Character legolas = archerFactory.createCharacter("Legolas");

        EquipmentFactory medievalFactory = new MedievalEquipmentFactory();
        EquipmentFactory magicFactory    = new MagicEquipmentFactory();
        EquipmentFactory rangerFactory   = new RangerEquipmentFactory();

        arthur.equipWeapon(medievalFactory.createWeapon());
        arthur.equipArmor(medievalFactory.createArmor());

        elara.equipWeapon(magicFactory.createWeapon());
        elara.equipArmor(magicFactory.createArmor());

        legolas.equipWeapon(rangerFactory.createWeapon());
        legolas.equipArmor(rangerFactory.createArmor());

        printCharacter(arthur);
        printCharacter(elara);
        printCharacter(legolas);
    }

    private static void printCharacter(Character c) {
        System.out.println(c.getStats());
        System.out.println("Equipment:");
        System.out.println(c.getEquipmentInfo());
        System.out.println("-------------------");
    }
}