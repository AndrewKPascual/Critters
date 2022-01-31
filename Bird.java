import java.util.Random;
import java.util.*;
public class Bird implements Critter {
    // creates random
    Random random = new Random();
    // a represents a choice for north and south if it is above 5 and west and east if not.
    private int randomDirection1;
    // b represents South and West if above 5 while North and East are below 5
    private int randomDirection2;
    public char getChar() {

        return 'B';

    }

 

    public int getMove(CritterInfo info) {
        // random creator for the random nature of movement
        randomDirection1 = random.nextInt(10)+1;
        randomDirection2 = random.nextInt(10)+1;
        if (randomDirection1 >5 && randomDirection2> 5) {
            return SOUTH;
        }
        if (randomDirection1 >5 && randomDirection2< 5) {
            return NORTH;
        }
        if (randomDirection1 <5 && randomDirection2> 5) {
            return WEST;
        }
        if (randomDirection1 <5 && randomDirection2< 5) {
            return EAST;
        }
        // this is required to compile and is a fall back.
        return CENTER;
    }

}