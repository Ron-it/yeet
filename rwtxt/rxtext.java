import java.io.*;
public class rxtext {
    public static void main(String[] args){
        WriteToFile();
    }

    public static void WriteToFile(){
        try{
            File dataFile = new File ("data.txt");

            FileWriter writer = new FileWriter(dataFile, true);

            BufferedWriter buff = new BufferedWriter(writer);

                buff.write("hi");
                buff.newLine();
                
                
                buff.flush();
                buff.close();


        }catch(Exception e){
            IBIO.output(e.getMessage());
        }
    }

}
