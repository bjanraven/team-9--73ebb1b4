package com.levelup.forestsandmonsters;
import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class StubGameMap extends GameMap{
    
    DIRECTION directionProvided; 
    Position startingPosition;
    Position STUB_NEW_POSITION = new Position(4,4);

    @Override
    public Position calculatePosition(Position startingPosition, DIRECTION direction) {
        this.directionProvided = direction;
        this.startingPosition = startingPosition;

        return STUB_NEW_POSITION;
    }
}
