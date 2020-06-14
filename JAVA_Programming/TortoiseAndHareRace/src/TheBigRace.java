import java.math.*;
import java.io.*;
import java.util.Random;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class TheBigRace
{
    // race start method
    public static void raceStart()
    {
        System.out.println("And they're off!");
    }
    // collision method
    public static void collisionNotice()
    {
        System.out.println("OUCH");
    }
    //TORTOISE PROPERTIES
    // Tortoise number gen
    public static int tortoiseRandomNumberGenerator()
    {
        int move_position = 0;
        int move;
        Random hare_move = new Random();
        move = hare_move.nextInt(10);
        //System.out.println("The random number generated was: " + move);
        if(move <= 5)
        {
            // Fast plod
            move_position = 3;
        }
        else if (6 <= move && move <= 8)
        {
            // Slow plod
            move_position = 1;
        }
        else if (9 <= move && move <= 10)
        {
            // Slip and fall
            move_position = -6;
        }
        return move_position;

    }
    // Hare properties
    // Hare random number generator
    public static int hareRandomNumberGenerator()
    {
        int move_position = 0;
        int move;
        Random hare_move = new Random();
        move = hare_move.nextInt(10);
        //System.out.println("The random number generated was: " + move);
        if(move >=1 && move <= 2)
        {
            move_position = 9;
        }
        else if(move >= 3 && move <= 5)
        {
            move_position = 1;
        }
        else if(move == 6)
        {
            move_position = -12;
        }
        else if(move >= 7 && move <= 8)
        {
            move_position = -2;
        }
        else if(move >= 9 && move <= 10)
        {
            move_position = 0;
        }
        return move_position;
    }

    public static void main(String [] args)
    {
        int tortoise_loop_pos,hare_loop_pos;
        int tortoise_pos = 1;
        int hare_pos = 1;
        raceStart();
        while(tortoise_pos <= 50 && hare_pos <= 50)
        {
            int tortoise_ran_num;
            int hare_ran_num;
            // Tortoise makes a move
            // 1. Generate the tortoises number
            tortoise_ran_num = tortoiseRandomNumberGenerator();
            // Make updates to the Tortoise position
            if (tortoise_ran_num <= 5)
            {
                for(tortoise_loop_pos=1;tortoise_loop_pos<=tortoise_ran_num;tortoise_loop_pos++)
                {
                    System.out.print("T");
                }
                tortoise_pos+=tortoise_ran_num;
            }
            if(tortoise_ran_num>=6 && tortoise_ran_num<=8)
            {
                for(tortoise_loop_pos=1;tortoise_loop_pos<=tortoise_ran_num;tortoise_ran_num++)
                {
                    System.out.print("T");
                }
                tortoise_pos+=tortoise_ran_num;
            }
            else if(tortoise_ran_num>=9 && tortoise_ran_num<=10)
            {
                // We gotta check the tortoise position and see if it's less than or equal to the ran_num
                if(tortoise_pos <= Math.abs(tortoise_ran_num))
                {
                    tortoise_pos = 1;
                    System.out.print("T");
                }
                else if(tortoise_pos > Math.abs(tortoise_ran_num))
                {
                    int temp_tort_low;
                    tortoise_pos = tortoise_pos + tortoise_ran_num;
                    for (temp_tort_low=1;temp_tort_low<=tortoise_pos;temp_tort_low++)
                    {
                        System.out.print("T");
                    }
                }
                // Hare makes a move
                //1. generate the hare's number here.
                hare_ran_num = hareRandomNumberGenerator();
            }
            // We need the following checks of their positions
            // 1. Are their positions equal during the race but not in position 50? OUCH
            // 2. Is the position of the Tortoise >= 50 while the Hare's position is less than 50? The Tortoise has was
            // 3. Is the position of Hare >= 50 while the Tortoise's position is less than 50? The Hare has won
            // 4. Are their positions equal? OUCH! They landed on the same space
            // 5. Are their positions equal AND are their positions == 50? Then they crossed the line at the same time.
            // 6. Are both their positons >= 50? If so then check who's position is bigger. That should be the winner of the race.
            if (tortoise_pos == 50 && hare_pos == 50)
            {
                System.out.println();
                System.out.println("IT WAS A TIE!");
                System.exit(0);
            }
            else if(tortoise_pos>=50 && hare_pos < 50)
            {
                System.out.println();
                System.out.print("Tortoise wins!");
                System.exit(0);
            }
            else if(tortoise_pos < 50 && hare_pos >= 50)
            {
                System.out.println();
                System.out.println("Hare wins!");
                System.exit(0);
            }
            else if(tortoise_pos == hare_pos)
            {
                System.out.println("OUCH! The Tortoise and Hare landed on the same space.");
            }
            else if((tortoise_pos == hare_pos) && (tortoise_pos == 50 && hare_pos == 50))
            {
                System.out.println();
                System.out.println("It was a tie!");
            }
            else if(tortoise_pos > 50 && hare_pos > 50)
            {
                // tortoise win
                if(tortoise_pos > hare_pos)
                {
                    System.out.println();
                    System.out.println("The Tortoise wins!");
                    System.exit(0);
                }
                if (hare_pos > tortoise_pos)
                {
                    System.out.println();
                    System.out.println("The Hare wins!");
                    System.exit(0);
                }
            }



        }


    }
}
