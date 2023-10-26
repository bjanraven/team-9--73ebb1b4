package com.levelup.forestsandmonsters;

import java.awt.Point;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class GameMap {

    public Object status;

    public int numPositions = 100;

    private Position[][] positions = new Position[10][10];

    public GameMap(){
        for(int i = 0; i <= 9; i++){
            for(int j = 0; j <= 9; j++){
                positions[i][j] = new Position(i,j);
            }
        }
    }


    public Position calculatePosition(Position startingPosition, DIRECTION direction) {
        int newYCoordinate = 0;
        int newXCoordinate = 0;

        if (direction.name().equals(DIRECTION.NORTH.name())) {
            newYCoordinate = startingPosition.point.y++; 
            newXCoordinate = startingPosition.point.x;        
        }
        else if (direction.name().equals(DIRECTION.SOUTH.name())) {
            newYCoordinate = startingPosition.point.y--;
            newXCoordinate = startingPosition.point.x; 
        }
        else if (direction.name().equals(DIRECTION.EAST.name())) {
            newXCoordinate = startingPosition.point.x++;
            newYCoordinate = startingPosition.point.y; 
        }
        else if (direction.name().equals(DIRECTION.WEST.name())) {
            newXCoordinate = startingPosition.point.x--;
            newYCoordinate = startingPosition.point.y; 
        }

        if(isPositionValid(new Point(newXCoordinate, newYCoordinate))){
            return this.positions[newXCoordinate][newYCoordinate];
        }
        else {
            return startingPosition;
        }
    }


    private boolean isPositionValid(Point positionCoordinates) {

        if(positionCoordinates.getX() <= 9 && positionCoordinates.getX() >= 0 &&
        positionCoordinates.getY() <= 9 && positionCoordinates.getY() >= 0){
            return true;
        }
        

        return false;
    }


    public Position[][] getPositions() {
        return positions;
    }


    public int getTotalPositions() {
        return numPositions;
    }
    
}
