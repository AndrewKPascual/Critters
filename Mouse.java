public class Mouse implements Critter {
    // a private variable that allows for the alteration between west and north
    private int swaper = 0;
    public char getChar() {

        return 'M';

    }

 

    public int getMove(CritterInfo info) {

        if (swaper == 0) {
            swaper++;
            return WEST;
        }
        if (swaper == 1) {
            swaper--;
            return NORTH;
        }
        // this is required to compile and is a fall back.
        return CENTER;
    }

}