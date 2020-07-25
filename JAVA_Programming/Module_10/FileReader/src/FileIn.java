import java.io.*;
public class FileIn
{
    /*
    This file needs to do the following:
    1. Read the provided text file
    2. Write a reformatted file(see HW for format)

    This program will have 3 run time parameters:
    1. The datasource file path
    2. The destination file path(So I assume this is where they want the output to go)
    3. The number of records in the data
     */
    static void read_dat( String file_in, String file_out , String file_length)
    {
        int state_code, total_pop, child_pop, chil_pov_pop;
        double child_pov_perc;
        /* do reading and manipulations here
        Should write to new file
         */
        /*
        TODO: Need to handle each row. We care about the following..
          Characters 1-2 Are the FIPS code we need(This starts at 1 so create an incrementor)
          Characters 83-90 Are the Total population so we need a variable to track that for each FIPS
          Characters 92 - 99 Are the child population
          Characters 101 - 108 Are num of children in poverty
         */
        int file_len = Integer.parseInt(file_length);

    }
    public static void main(String args [])
    {
        String file_in , file_out, num_records ;
        file_in = args[0]; // File to read
        file_out = args[1]; // file to write maniplulated to
        num_records = args[2]; // num of records in the data set
        read_dat(file_in , file_out , num_records);




    }
}
