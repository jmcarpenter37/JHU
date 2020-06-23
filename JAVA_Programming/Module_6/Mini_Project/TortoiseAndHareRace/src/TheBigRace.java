import java.math.*;
import java.io.*;
import java.util.Random;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class TheBigRace {
    // race start method
    public static void raceStart() {
        System.out.println("And they're off!");
    }

    // collision method
    public static void collisionNotice() {
        System.out.println("OUCH");
    }

    //TORTOISE PROPERTIES
    // Tortoise number gen
    public static int tortoiseRandomNumberGenerator() {
        int move_position = 0;
        int move;
        Random hare_move = new Random();
        move = hare_move.nextInt(10);
        //System.out.println("The random number generated was: " + move);
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

    // Hare properties
    // Hare random number generator
    public static int hareRandomNumberGenerator() {
        int move_position = 0;
        int move;
        Random hare_move = new Random();
        move = hare_move.nextInt(10);
        //System.out.println("The random number generated was: " + move);
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

    public static void main(String[] args) {
        int tortoise_loop_pos, hare_loop_pos;
        int tortoise_pos = 1;
        int hare_pos = 1;
        raceStart();
        while (tortoise_pos <= 50 && hare_pos <= 50) {
            int tortoise_move_num;
            int hare_move_num;
            // Tortoise makes a move
            // 1. Generate the tortoises number
            tortoise_move_num = tortoiseRandomNumberGenerator();
            //tortoise_move_num can only be +3 , +1, or -6
            System.out.println("The Tortoise is moving: " + tortoise_move_num + " positions");
            // First do the position update
            tortoise_pos = tortoise_pos + tortoise_move_num;
            System.out.println("The Tortoise position is: " + tortoise_pos);
            // This first if statement covers the case where the Tortoise cannot slip less than position = 1
            if (tortoise_pos <= 0)
            {
                //System.out.println();
                System.out.print("T");
                tortoise_pos = 1;
            }
            else
                {
                for (tortoise_loop_pos=1;tortoise_loop_pos<=tortoise_pos;tortoise_loop_pos++)
                {
                    System.out.print("T");
                    //System.out.println();
                }
                System.out.println();
            }
            // Hare makes a move
            // 1. Generate the hares move number
            hare_move_num = hareRandomNumberGenerator();
            System.out.println("The hare is moving: " + hare_move_num + " spaces");
            // The function above returns a move position of +9 , +1, -12, -2, 0(The hare falls asleep at 0)
            hare_pos = hare_pos + hare_move_num;
            System.out.println("The Hare's position is: " + hare_pos);
            if(hare_pos <= 0)
            {
                System.out.print("H");
                hare_pos = 1;
            }
            else {
                for(hare_loop_pos=1;hare_loop_pos<=hare_pos;hare_loop_pos++)
                {
                    System.out.print("H");
                }
                System.out.println();
            }
            
            // According to instructions to determine a winner the following logic is applied:
            // The contender that first reaches or passes the last position of the course is the winner of the race.
            // We need to check the following:
            // Immediately check if either Tortoise or Hare are at pos >= 50 and determine a winner
            if (tortoise_pos >= 50)
            {
                System.out.println("The Tortoise wins!");
                System.out.println("The Tortoise made it to position: "+ tortoise_pos);
                System.out.println("The Hare made it to position: " + hare_pos);
                System.exit(0);
            }
            if (hare_pos >= 50)
            {
                System.out.println("The Hare wins!");
                System.out.println("The Tortoise made it to position: "+ tortoise_pos);
                System.out.println("The Hare made it to position: " + hare_pos);
            }
            if ((hare_pos == tortoise_pos) && (hare_pos < 50 && tortoise_pos < 50))
            {
                System.out.println("OUCH! They landed on the same spot.");
                System.out.println("The Tortoise is in position: "+tortoise_pos);
                System.out.println("The Hare is in position: "+hare_pos);
                System.out.println();

            }
            else if((hare_pos >= 50 && tortoise_pos >= 50) && (hare_pos == tortoise_pos))
            {
                System.out.println("It's a tie!");
                System.out.println("The Tortoise ended in position: " + tortoise_pos);
                System.out.println("The Hare ended in position: " + hare_pos);
            }



        }
    }
}