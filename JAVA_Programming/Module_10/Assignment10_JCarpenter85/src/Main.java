public class Main {
    public static void main(String args [])
    {
        String file_in , file_name_out , len_file;
        file_in = args[0];
        file_name_out = args[1];
        len_file = args[2];
        DataPrepper data_obj = new DataPrepper();
        //data_obj.data_read("C:\\Users\\black\\Desktop\\JHU_Gradschool\\JHU\\JAVA_Programming\\Module_10\\Assignment10_JCarpenter85\\SmallAreaIncomePovertyEstData.txt","C:\\Users\\black\\Desktop\\Data_out.txt","13486");
        data_obj.data_read(file_in , file_name_out , len_file);
    }
}
