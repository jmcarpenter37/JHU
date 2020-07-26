import java.io.FileReader;
import java.io.IOException;

/**
 * @author John Carpenter
 */
public class FileOut
{
    /*
    This file needs to do the following:
    1. Creates the report to stdout
    Note before the report is displayed, a single line with
    “File: “ then the path of the input file for the report is displayed.

    This program will have 2 runtime parameters:
    1. Input file path
    2. Number of records
     */
    public static void main(String args [])
    {
        String file_in , num_records;
        file_in = args[0];
        num_records = args[1];
        System.out.println("File: " + file_in);
        try
        {
            FileReader file = new FileReader(file_in);
            int line;
            while((line = file.read()) != -1) // -1 is an end of file
            {
                System.out.println((char) line);
            }

        }catch (IOException err)
        {
            System.out.println("An IOException has occured: ");
            System.out.println(err);
        }
    }

}
