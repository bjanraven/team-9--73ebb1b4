package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.isNotNull;

import java.awt.Point;

import org.junit.Test;

public class PositionTest {
    
    @Test
    public void initPosition(){
        Position position = new Position(4,4);

        assertEquals(position, isNotNull());
    }
}
