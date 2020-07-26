import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReportOut
{
    public static void main(String args [])
    {
        String read_file , length_file;
        read_file = args[0];
        length_file = args[1];
        int len_file = Integer.parseInt(length_file);
        // Need to pass in path to file to see and file length
        try {
            BufferedReader buff_read = new BufferedReader(new FileReader(read_file));
            System.out.println("File: " + read_file);
            // present the report to the user
            String line = buff_read.readLine();
            while(line != null)
            {
                System.out.println(line);
                line = buff_read.readLine();
            }
        }catch (IOException err)
        {
            err.printStackTrace();
        }
    }
}
