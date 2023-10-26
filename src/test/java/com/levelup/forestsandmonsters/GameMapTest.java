package com.levelup.forestsandmonsters;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.awt.Point;

import org.junit.Test;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class GameMapTest {
    @Test
    public void initializationCreatesResults() {
        GameMap testMap = new GameMap();
        assertNotNull(testMap.numPositions);
    }
    
    @Test
    public void test_calculate_position() {
        GameMap gameMap = new GameMap();
        assertNotNull(gameMap.getPositions()[4][4]);
        assertNotNull(gameMap.getPositions()[9][5]);
        assertNotNull(gameMap.getPositions()[3][3]);
    }

}
