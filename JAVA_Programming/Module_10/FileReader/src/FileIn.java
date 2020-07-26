import java.io.*;

public class FileIn {
    public void readData() {
        //int file_len = Integer.parseInt(13486);
        RowRead my_data[] = new RowRead[13486]; // Initializes a an instance of RowRead object
        // We use the above code ot manipulate data
        try (FileReader fileread = new FileReader("C:\\Users\\black\\Desktop\\JHU_Gradschool\\JHU\\JAVA_Programming\\Module_10\\Assignment10_JCarpenter85\\SmallAreaIncomePovertyEstData.txt"))// attempt to read the file passed in via command line
        {
            final int newline = 10;
            int char_val;
            int row_index = 0;
            int col_index = 0; // keep track as we move along the file by column index
            char in_row[] = new char[132 * 13486]; // Width of file + newline + null pointer is 132

            while ((char_val = fileread.read()) != -1)//While the chracter is not an EOF
            {
                //System.out.println(in_row[row_index]);
                in_row[row_index] = (char) char_val; // cast char_val to get actual value and not unicode value
                row_index++;
            }
            if(char_val == newline)
            {
                my_data[col_index] = new RowRead(in_row);
                col_index++;
                row_index=0;
            }
            for(int i = 0; i < my_data.length ; i++)
            {
                System.out.println(my_data[i]);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}


//    public RowRead [] writeDat(RowRead [] data_to_manipulate)
//    {
//        RowRead [] data_to_show = new RowRead[57]; // There are 56 unique IDs for column 0 and 57 because of the null pointer
//
//        try(BufferedWriter write_to_buff = new BufferedWriter(new FileWriter("C:\\Users\\black\\Desktop\\New_Data.txt")))
//        {
//            int fips_id , state_population, child_population, child_poverty_population;
//            fips_id = 1; // Increment through based on the fips id
//            state_population = 0; // use to add up state population
//            child_poverty_population = 0; // user to add up the child poverty population
//            child_population = 0; // use to add up the total child population
//            for (int fips_counter = 0 ; fips_counter < data_to_manipulate.length;fips_counter++) {
//                // loop through the fips indices to
//                // check that the fips id in the file match the counter
//                if (fips_id == data_to_manipulate[fips_counter].fips_id) // If they match start counting
//                {
//                    state_population = state_population + data_to_manipulate[fips_counter].total_population;
//                    child_population = child_population + data_to_manipulate[fips_counter].child_population;
//                    child_poverty_population = child_poverty_population + data_to_manipulate[fips_counter].child_poverty_population;
//                } else {
//                    double state_child_pov_percent;
//                    if (child_population != 0) {
//                        state_child_pov_percent = 100 * (double) child_population / child_poverty_population;
//                    } else {
//                        state_child_pov_percent = 0;
//                    }
//                    // Write our calculations to the buffer
//                    write_to_buff.append(fips_id + " \t " + state_population + " \t " + child_population + " \t " + child_poverty_population + " \t " + state_child_pov_percent);
//                    state_population = 0;
//                    child_population = 0;
//                    child_poverty_population = 0;
//                    fips_id = fips_id + 1;
//                    fips_counter = fips_counter - 1;
//
//                }
//
//            }
//
//
//
//        }catch(IOException err)
//            {
//                System.out.println("IO Exception");
//                err.printStackTrace();
//            }
//
//        return data_to_show;
//
//    }
//
//}



