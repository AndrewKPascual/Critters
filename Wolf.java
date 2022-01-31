public class Wolf implements Critter {
    // I wanted to to make it so the wolf guards the "lair" until they find a target using getNeighbor however, I couldn't figure out how to use it so I left it as a carbon copy as the turtle.
    // It would be nice to know how the critterInfo works and how implement is different from extends since I am unsure how to call for getNeighbor.
    
    
    // a represents the number of moves it made
    private int move = 0;
    // b represents the direction the animal is currently traveling in.
    private int direction = 0;
    public char getChar() {

        return 'W';

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