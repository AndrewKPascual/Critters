public class Turtle implements Critter {
    // a represents the number of moves it made
    private int move = 0;
    // b represents the direction the animal is currently traveling in.
    private int direction = 0;
    public char getChar() {

        return 'T';

    }

 

    public int getMove(CritterInfo info) {
        // this if statement changes checks if it has moved five increments and if soo it changes the direction
        if ( move == 5) {
            direction++;
            // this resets the direction back to the default south to make it go in a circle
            if (direction >= 4) {
               direction = 0; 
            }
            move = 0;
        }
        if (direction == 0) {
            move++;
            return SOUTH;
        }
        if (direction == 1) {
            move++;
            return WEST;
        }
        if (direction== 2) {
            move++;
            return NORTH;
        }
        if (direction == 3) {
            move++;
            return EAST;
        }
        // this is required to compile and is a fall back.
        return CENTER;
    }

}