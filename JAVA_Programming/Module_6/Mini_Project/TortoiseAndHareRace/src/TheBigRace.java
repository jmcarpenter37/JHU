import java.util.Random;

/**
 * TheBigRace class does a simulation of the Tortoise and Hare race
 */
public class TheBigRace {
    // Tortoise random number generator
    /***
     * The tortoiseRandomNumberGenerator function simulates the Tortoise moving
     *
     * @author John Carpenter
     * @return Returns an int that represents the number of positions the Tortoise moves
     */
    public static int tortoiseRandomNumberGenerator() {
        int move_position = 0;
        int move;
        Random hare_move = new Random();
        move = hare_move.nextInt(10);
        if (move <= 5) {
            // Fast plod
            move_position = 3;
        } else if (6 <= move && move <= 8) {
            // Slow plod
            move_position = 1;
        } else if (9 <= move && move <= 10) {
            // Slip and fall
            move_position = -6;
        }
        return move_position;
    }
    // Hare random number generator
    /***
     * The hareRandomNumberGenerator function simulates the Hare moving
     *
     * @author John Carpenter
     * @return Returns an int that represents the number of positions the Hare moves
     */
    public static int hareRandomNumberGenerator() {
        int move_position = 0;
        int move;
        Random hare_move = new Random();
        move = hare_move.nextInt(10);
        if (move >= 1 && move <= 2) {
            move_position = 9;
        } else if (move >= 3 && move <= 5) {
            move_position = 1;
        } else if (move == 6) {
            move_position = -12;
        } else if (move >= 7 && move <= 8) {
            move_position = -2;
        } else if (move >= 9 && move <= 10) {
            move_position = 0;
        }
        return move_position;
    }
    // Being main routine
    public static void main(String[] args) {
        int tortoise_loop_pos, hare_loop_pos;
        int tortoise_pos = 1;
        int hare_pos = 1;
        System.out.println("And they're off!");
        while (tortoise_pos <= 50 && hare_pos <= 50) {
            int tortoise_move_num;
            int hare_move_num;
            tortoise_move_num = tortoiseRandomNumberGenerator();
            tortoise_pos = tortoise_pos + tortoise_move_num;
            if (tortoise_pos <= 0) {
                // Reset the Tortoise's position back to one since we cant have negative position
                System.out.print("T");
                tortoise_pos = 1;
                System.out.println();
            } else {
                for (tortoise_loop_pos = 1; tortoise_loop_pos <= tortoise_pos; tortoise_loop_pos++) {
                    System.out.print("T");
                }
                System.out.println();
            }
            hare_move_num = hareRandomNumberGenerator();
            hare_pos = hare_pos + hare_move_num;
            if (hare_pos <= 0) {
                // Reset the Hare's position back to one since we cant have negative position
                System.out.print("H");
                hare_pos = 1;
                System.out.println();
            } else {
                for (hare_loop_pos = 1; hare_loop_pos <= hare_pos; hare_loop_pos++) {
                    System.out.print("H");
                }
                System.out.println();
            }
            // Begin checking the positions
            if (tortoise_pos >= 50) {
                System.out.println("The Tortoise wins!");
                System.exit(0);
            }
            if (hare_pos >= 50) {
                System.out.println("The Hare wins!");
                System.exit(0);
            }
            if ((hare_pos == tortoise_pos) && (hare_pos < 50 && tortoise_pos < 50)) {
                // Checking to see if their positions are empty
                System.out.println("OUCH!");

            } else if ((hare_pos >= 50 && tortoise_pos >= 50) && (hare_pos == tortoise_pos)) {
                System.out.println("It's a tie!");
            }
        }
    }
}