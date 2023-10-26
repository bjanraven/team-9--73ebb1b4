package com.levelup.forestsandmonsters;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.awt.Point;

import org.junit.Test;

public class GameStatusTest {
    
    @Test
    public void initializationGameStatus() {
        GameStatus gs = new GameStatus("Mickey", new Point(5,5), 1 );
        assertNotNull(gs.characterName);
        assertNotNull(gs.currentPosition);
        assertNotNull(gs.moveCount);
    }

    @Test
    public void test_get_status() {
        GameStatus gs = new GameStatus("Mickey", new Point(5,5), 1 );
        String currentStatus = gs.getStatus();
        assertNotNull(currentStatus);
    }
}
