import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class rxtext {
    public static void main(String[] args) {
        // WriteToFile();
        // readFile();
        demoArrayList();
    }

    public static void WriteToFile() {

        String c = IBIO.inputString("Enter text: ");
        String d = IBIO.inputString("Enter text: ");

        try {
            File dataFile = new File("data.txt");

            FileWriter writer = new FileWriter(dataFile, true);

            BufferedWriter buff = new BufferedWriter(writer);

            buff.write(c);
            buff.write("," + d);
            buff.newLine();

            buff.flush();
            buff.close();

        } catch (Exception e) {
            IBIO.output(e.getMessage());
        }
    }

    public static void readFile() {

        File f = new File("data.txt");
        String line = "";

        String[] names = null;

        try {

            f.createNewFile();
            FileReader reader = new FileReader(f);
            BufferedReader b = new BufferedReader(reader);

            while ((line = b.readLine()) != null) {
                IBIO.output(line);
                line.split(",");
                names = line.split(",");

            }
            IBIO.output("First name: " + names[0]);
            IBIO.output("Last name: " + names[1]);

        } catch (Exception e1) {
            IBIO.output(e1.getMessage());
        }

    }

    public static void demoArrayList() {

        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> FirstNames = new ArrayList<String>();

        int nameno = IBIO.inputInt(": ");

        for (int i = 0; i < nameno; i++) {
            String Name = IBIO.inputString("Enter name: ");
            FirstNames.add(i, Name);
        }

        Object array[] = FirstNames.toArray();
        for (int i = 0; i < array.length; i++) { // convert -> array , print
            IBIO.output(array[i].toString());
        }
        FirstNames.remove("name4");
        FirstNames.set(3, "newname");

        IBIO.output(FirstNames.indexOf("newname"));

        for (int i = 0; i < FirstNames.size(); i++) { // print values from list (arraylist)
            IBIO.output(FirstNames.get(i));
        }

        /*
         * FirstNames.add("Name1"); FirstNames.add("Name2"); FirstNames.add("Name3");
         * FirstNames.add("Name4"); FirstNames.add("Name5");
         * 
         * IBIO.output(FirstNames.get(3));
         * 
         * FirstNames.add(4, "NewName");
         * 
         * IBIO.output(FirstNames.get(4));
         * 
         * FirstNames.
         * 
         * names.add("firstval"); names.add("secondval"); names.add("thirdval");
         * names.add("fifthval");
         * 
         * names.add(3, "fourthval");
         * 
         * IBIO.output(names.get(3));
         */

    }

}