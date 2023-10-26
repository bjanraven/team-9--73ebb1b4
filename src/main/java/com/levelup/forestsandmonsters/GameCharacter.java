package com.levelup.forestsandmonsters;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class GameCharacter {
    
    private String name;
    Position currentPosition;
    private GameMap map;
    int moveCount = 0;

    public GameCharacter(String name){
        this.name = name;
    }

    public GameCharacter(){
        
    }

    public String getName(){
        return name;
    }

    public Position getPosition(){
        return currentPosition;
    }

    
    public void enterMap(GameMap map){
        this.map = map;
    }
    

    public void move(DIRECTION direction) {
        this.currentPosition = map.calculatePosition(this.currentPosition, direction);
        moveCount++;
    }

    public int getMoveCount() {
        return moveCount;
    }
}
