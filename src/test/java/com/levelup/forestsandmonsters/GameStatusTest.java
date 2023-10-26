package com.levelup.forestsandmonsters;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.awt.Point;

import org.junit.Test;

public class GameStatusTest {
    
    @Test
    public void initializationGameStatus() {
        GameStatus testObj = new GameStatus("Mickey", new Point(5,5), 1 );
        assertNotNull(testObj.characterName);
    }
    
}
