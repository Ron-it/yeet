// import javax.lang.model.util.ElementScanner6;

// import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class PracticeTest2 {

    public static void main(String[] args) {
        System.out.println("Ronit");
        System.out.println("");

        int x;

        do {

            x = IBIO.inputInt("Enter an integer between 1 and 9:  0 to exit ");

            if ((x < 1 || x > 9) && x!=0)

            {
                System.out.println("Error - Number out of range");

            }  
            else if(x!=0){
            
                int result;

                for (int i = 1; i <= 20; i++)


                {
                    result = (x * i);
                    System.out.printf("\n %d * %d = %d\n", x, i, result );
                }

            }

             if (x == 0) {

                System.exit(0);
            }

        } while ((x < 1 || x > 9) || x!=0); 

    }
}
