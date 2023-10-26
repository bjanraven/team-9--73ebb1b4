package com.levelup.forestsandmonsters;

import java.awt.Point;

public class GameController {

    static final String DEFAULT_CHARACTER_NAME = "Character";

    private GameCharacter gameCharacter;
    GameMap map;

    public class GameStatus {
        // TODO: Add other status data
        public String characterName = DEFAULT_CHARACTER_NAME;
        public Point currentPosition = new Position(4, 4).point;
        public int moveCount = 0;

        public GameStatus(String characterName, Point currentPosition,  int moveCount)
        {
            this.characterName = characterName;
            this.currentPosition = currentPosition;
            this.moveCount = moveCount;
        }

        public GameStatus() {
        }
    }

    GameStatus status;

    public GameController() {
        status = new GameStatus();
    }

    public GameController(String characterName, Point currentPosition,  int moveCount) {
        status = new GameStatus(characterName, currentPosition, moveCount);
    }

    public static enum DIRECTION {
        NORTH, SOUTH, EAST, WEST
    }

    public void createCharacter(String name) {
        String charName = name;
        if (charName == null || charName.equals("")) {
            charName = DEFAULT_CHARACTER_NAME;
        }
        status.characterName = charName;
        gameCharacter = new GameCharacter(charName);
    }

    public void startGame() {
        map = new GameMap();
        if(gameCharacter == null)
        {
            this.gameCharacter = new GameCharacter();
        }
        gameCharacter.enterMap(map);
        this.status.characterName = this.gameCharacter.getName();
        this.status.currentPosition = this.gameCharacter.getPosition().point;
        this.status.moveCount = this.gameCharacter.moveCount;
    }

    public GameStatus getStatus() {
        return this.status;
    }

    public void move(DIRECTION directionToMove) {
        gameCharacter.move(directionToMove);
        this.status.currentPosition = gameCharacter.getPosition().point;
        this.status.moveCount = gameCharacter.getMoveCount();
    }

    public void setCharacterPosition(Point coordinates) {
        if(gameCharacter == null)
            this.gameCharacter = new GameCharacter();
        this.gameCharacter.currentPosition = new Position(coordinates.x, coordinates.y);
        this.gameCharacter.moveCount = gameCharacter.getMoveCount();
        this.status.characterName = this.gameCharacter.getName();
        this.status.currentPosition = this.gameCharacter.currentPosition.point;
        this.status.moveCount = this.gameCharacter.moveCount;
    }

    public int getTotalPositions() {
        return this.map.getTotalPositions();
    }

}
