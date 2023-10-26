package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class GameCharacterTest {
    
    @Test
    public void characterDefaultNameTest() {
        GameCharacter character = new GameCharacter("WELLS MANSION PLAYER");
        assertEquals(character.getName(), "WELLS MANSION PLAYER");
        
    }

    @Test
    public void characterWithNameTest() {
        GameCharacter characterName= new GameCharacter("Legends of the dragons");
        assertEquals(characterName.getName(), "Legends of the dragons");
        
    }

     
    @Test
    public void characterPositionTest() {
        GameCharacter characterPosition = new GameCharacter("WELLS MANSION PLAYER");
        assertNull(characterPosition.getPosition());
    }
    
}
