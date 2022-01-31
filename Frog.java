import java.util.Random;
import java.util.*;
public class Frog implements Critter {
    Random random = new Random();
    // dirving from the bird the frog gets two random variables to decide direction
    private int randomDirection1;
    private int randomDirection2;
    // similar to the turtle this statement checks the number of movements then allows for change if it has incremented enough
    private int moves = 3;
    private int direction;
    public char getChar() {

        return 'F';

    }

 

    public int getMove(CritterInfo info) {
        // random number assigners
        randomDirection1 = random.nextInt(10)+1;
        randomDirection2 = random.nextInt(10)+1;
        if (moves == 0) {
            direction = 0;
            moves = 3;
        }
        if (moves > 0 && moves< 3) {
            if (direction == 1) {
                direction = 1;
                moves--;
                return SOUTH;
            }
            if (direction == 2) {
                direction = 2;
                moves--;
                return NORTH;
            }
            if (direction == 3) {
                direction = 3;
                moves--;
                return WEST;
            }
            if (direction == 4) {
                direction = 4;
                moves--;
                return EAST;
            }
        }
        if (moves == 3) {
            if (randomDirection1 >5 && randomDirection2> 5) {
                direction = 1;
                moves--;
                return SOUTH;
            }
            if (randomDirection1 >5 && randomDirection2< 5) {
                direction = 2;
                moves--;
                return NORTH;
            }
            if (randomDirection1 <5 && randomDirection2> 5) {
                direction = 3;
                moves--;
                return WEST;
            }
            if (randomDirection1 <5 && randomDirection2< 5) {
                direction = 4;
                moves--;
                return EAST;
            }
        }
        return CENTER;
    }

}