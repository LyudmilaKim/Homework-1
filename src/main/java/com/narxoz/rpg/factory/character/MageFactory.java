package com.narxoz.rpg.factory.character;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.character.Mage;

public class MageFactory implements CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        return new Mage(name);
    }
}