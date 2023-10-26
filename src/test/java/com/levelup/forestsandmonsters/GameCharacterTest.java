package com.levelup.forestsandmonsters;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.Point;
import org.junit.Test;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class GameCharacterTest {
    
    @Test
    public void characterDefaultNameTest(){
        GameCharacter character = new GameCharacter();
        assertEquals(character.getName(), "WELLS MANSION PLAYER");
        
    }

    @Test
    public void characterWithNameTest(){
        GameCharacter characterName= new GameCharacter("Legend of the dragons");
        assertEquals(characterName.getName(), "Legends of the dragons");
        
    }

    @Test
    public void characterPositionTest(){
        GameCharacter characterPosition= new GameCharacter();
        assertEquals(characterPosition.getPosition(), new Point(4,4));
    }


    @Test
    public void characterMoveDirectionTest(){
        GameCharacter characterDirection = new GameCharacter();
        characterDirection.move(DIRECTION.NORTH);
        assertEquals(new Point(4,5), characterDirection.getPosition());
    }

    /*
    @Test
    public void enterMap(GameMap map){
        assertEquals(map, map);
    }
    */
    
}
