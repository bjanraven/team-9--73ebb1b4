package com.levelup.forestsandmonsters;

import java.awt.Point;

public class Position {

    public Point point;
    
    public Position(){
        point = new Point(4,4);
    }

    public Position(int x, int y){
        point = new Point(x,y);
    }
}
