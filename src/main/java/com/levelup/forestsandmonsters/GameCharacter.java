package com.levelup.forestsandmonsters;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class GameCharacter {
    
    private String name;
    private Position currentPosition;
    //private GameMap map;

    public GameCharacter(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public Position getPosition(){
        return currentPosition;
    }

    /* 
    public void enterMap(GameMap map){
        this.map = map;
    }
    */

    public DIRECTION move(DIRECTION direction){
        return direction;
    }
}
