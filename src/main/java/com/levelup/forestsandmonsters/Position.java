package com.levelup.forestsandmonsters;

import java.awt.Point;

public class Position {

    public Point point;

    private static int DEFAULT_X = 4;
    private static int DEFAULT_Y = 4;
    
    public Position(){
        point = new Point(DEFAULT_X, DEFAULT_Y);
    }

    public Position(int x, int y){
        point = new Point(x,y);
    }
}
