import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DataPrepper
{
    public void data_read(String file_in, String file_path_out , String file_length)
    {
        // file length to an int
        int file_len = Integer.parseInt(file_length);
        RowHandler row_data [] = new RowHandler[132*file_len];
        // try to read the data
        try(FileReader file_to_read = new FileReader(file_in))
        {
            final int EOF = -1;
            final int new_line = 10;
            System.out.println("READ FILE GOOD");
            int char_val;
            int i , j;
            i = 0;
            j = 0;
            char rowIn [] = new char [132*file_len];
            while ((char_val = file_to_read.read()) != EOF)
            {
                //System.out.println("I is: " + i);
                rowIn[i] = (char) char_val;//cast as char to get the character val and not unicode val
                i++;
                // check for a new line
                if (char_val == new_line)
                {
                    row_data[j] = new RowHandler(rowIn);
                    j++;
                    i = 0;
                }
            }
        }catch (IOException err)
        {
            err.printStackTrace();
        }
        //System.out.println(row_data[0].state_population);
        RowHandler my_new_data [] = new RowHandler[57]; // This new object array will have 57 rows. use the getters to check the data looks good
        //try to open a buffer for writing to a new file
        try(BufferedWriter buffer_to_write = new BufferedWriter(new FileWriter(file_path_out)))
        {
            // First write the headers to the file
            buffer_to_write.append("State" + "\t" + "Population" + "\t" + "Child Population" + "\t" + "Child Poverty Population" + "\t"  + "% Child Poverty" + "\n");
            System.out.println("Successfully opened a buffer for writing!");
            int fips_id, total_state_population, total_child_population, total_child_poverty_population;
            fips_id = 1; // fips_id is our base to count and compare
            total_state_population = 0;
            total_child_population = 0;
            total_child_poverty_population = 0;
            for(int i = 0 ; i < file_len;i++)
            {
                // check off of fips id
                if(fips_id == row_data[i].fips_id)
                {
                    // begin to accumulate the number
                    total_state_population = total_state_population + row_data[i].state_population;
                    total_child_poverty_population = total_child_poverty_population + row_data[i].child_pov_population;
                    total_child_population = total_child_population + row_data[i].child_population;
                }
                else
                {
                    double total_child_pov_percent = 0;
                    if(total_child_poverty_population != 0)
                    {
                        total_child_pov_percent = 100 * (double) total_child_poverty_population / total_state_population ; // cast ints to doulble and multiply by 100 to get the percentage
                    }
                    else
                    {
                        total_child_pov_percent = 0;
                    }
                    // write values to the buffer
                    buffer_to_write.append( fips_id + "\t"+ total_state_population + "\t"+"\t" + total_child_population + "\t"+"\t" +"\t"+ total_child_poverty_population + "\t"+"\t"+"\t"+"\t" + total_child_pov_percent + "\n");
                    fips_id++;
                    // reset counters for the new fips id
                    total_state_population = 0;
                    total_child_population = 0;
                    total_child_poverty_population = 0;
                    i++;


                }



            }
            System.out.println(total_state_population);
        }catch (IOException err)
        {
            err.printStackTrace();
        }
    }

}
