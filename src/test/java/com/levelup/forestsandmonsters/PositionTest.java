package com.levelup.forestsandmonsters;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

public class PositionTest {
    

    private static int TEST_X = 4;
    private static int TEST_Y = 4;

    @Test
    public void initPosition(){
        Position position = new Position(TEST_X,TEST_Y);
         assertNotNull(position);
    }

    @Test
    public void initXPosition(){
        Position pos = new Position(TEST_X,TEST_Y);
        assertEquals(TEST_X, pos.point.getX());
    }

    @Test
    public void initYPosition(){
        Position pos = new Position(TEST_X,TEST_Y);
        assertEquals(TEST_Y, pos.point.getY());
    }
}
