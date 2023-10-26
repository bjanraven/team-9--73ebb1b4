package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.awt.Point;
import org.junit.Test;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class GameCharacterTest {
    
    @Test
    public void characterDefaultNameTest(){
        GameCharacter character = new GameCharacter("WELLS MANSION PLAYER");
        assertEquals(character.getName(), "WELLS MANSION PLAYER");
        
    }

    @Test
    public void characterWithNameTest(){
        GameCharacter characterName= new GameCharacter("Legends of the dragons");
        assertEquals(characterName.getName(), "Legends of the dragons");
        
    }

     
    @Test
    public void characterPositionTest(){
        GameCharacter characterPosition = new GameCharacter("WELLS MANSION PLAYER");
        assertNull(characterPosition.getPosition());
    }

    public void testValidDirection(){
        GameCharacter character = new GameCharacter("WELLS MANSION PLAYER");

        assertEquals(character.move(DIRECTION.EAST), DIRECTION.WEST);
        assertEquals(character.move(DIRECTION.WEST), DIRECTION.EAST);
        assertEquals(character.move(DIRECTION.NORTH), DIRECTION.SOUTH);
        assertEquals(character.move(DIRECTION.SOUTH), DIRECTION.NORTH);
    }


    /*
    @Test
    public void enterMap(GameMap map){
        assertEquals(map, map);
    }
    */

}
