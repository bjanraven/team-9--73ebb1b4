Feature: Move in a direction 
![MoveSpec](images/Spec_by_example.png)
![Activity](images/Activity_diagram.png)
    
    I want to move my character. If they attempt to 
    move past a boundary, the move results in no change in position but does increment move count.

    Scenario Outline: Move in a direction
        Given the character starts at position with XCoordinates <startingPositionX> 
        And starts at YCoordinates <startingPositionY>
        And the player chooses to move in <direction>
        And the current move count is <startingMoveCount>
        When the character moves
        Then the character is now at position with XCoordinates <endingPositionX>
        And YCoordinates <endingPositionY>
        And the new move count is <endingMoveCount>
        Examples:
            | startingPositionX | startingPositionY | direction | startingMoveCount | endingPositionX | endingPositionY | endingMoveCount |
            | 5 | 9 | NORTH | 68 | 5 | 9 | 69 |
            | 9 | 5 | EAST  | 9 | 9 | 5 | 10 |
            | 0 | 0 | SOUTH | 0 | 0 | 0 | 1 |
            | 0 | 9 | WEST  | 5 | 0 | 9 | 6 |
            | 9 | 0 | EAST  | 1 | 9 | 0 | 2 |
            | 3 | 0 | SOUTH | 3 | 3 | 0 | 4 |
            | 3 | 0 | NORTH | 32 | 3 | 1 | 33 |
            | 0 | 0 | NORTH | 7 | 0 | 1 | 8 |
            | 4 | 5 | SOUTH | 10 | 4 | 4 | 11 |
            | 5 | 6 | EAST  | 20 | 6 | 6 | 21 |
            | 4 | 4 | WEST  | 22 | 3 | 4 | 23 |
            | 3 | 4 | NORTH  | 0 | 3 | 5 | 1 |
            | 3 | 5 | EAST  | 1 | 4 | 5 | 2 |
            | 4 | 5 | WEST  | 1 | 3 | 5 | 2 |
            | 3 | 5 | SOUTH  | 3 | 3 | 4 | 4 |
