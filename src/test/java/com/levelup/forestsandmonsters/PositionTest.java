package com.levelup.forestsandmonsters;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.awt.Point;

import org.junit.Test;

public class PositionTest {
    
    @Test
    public void initPosition(){
        Position position = new Position(4,4);

         assertNotNull(position);
    }

    
}
