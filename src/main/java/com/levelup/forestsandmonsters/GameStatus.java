package com.levelup.forestsandmonsters;
import java.awt.Point;

public class GameStatus {
    
    public String characterName;

    public Point currentPosition;

    public int moveCount;
    
    public GameStatus(String characterName, Point currentPosition,  int moveCount)
    {
        this.characterName = characterName;
        this.currentPosition = currentPosition;
        this.moveCount = moveCount;
    }

}