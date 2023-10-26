package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.awt.Point;

import org.junit.Test;

import com.levelup.forestsandmonsters.GameController.GameStatus;

public class GameControllerTest {
    @Test
    public void initializationCreatesResults() {
        GameController testObj = new GameController("Mickey", new Point(5,5), 1);
        assertNotNull(testObj.status);
    }

     @Test
    public void test_get_status() {
        GameController testObj = new GameController("Mickey", new Point(5,5), 1);
        GameStatus currentStatus = testObj.status;
        assertNotNull(currentStatus);
    }

    @Test
    public void test_move_count() {
        GameController gc = new GameController("Mickey", new Point(5,5), 1);
        assertEquals(1, gc.status.moveCount);
    }

}
