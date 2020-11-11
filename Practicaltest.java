public class Practicaltest
{
	
	public static void main (String[] args) 
	{
        IBIO.output("Ronit");
        // while version
        int x = IBIO.inputInt("How many numbers to process?: ");
        while(x<5)
        {
            IBIO.output("Error - number out of range.");
            x = IBIO.inputInt("How many numbers to process?: ");
        }
        IBIO.output(x);

        // // do while version
        // do{
        //     x = IBIO.inputInt("How many numbers to process?: ");
        //     if(x<5)
        //         IBIO.output("Error - number out of range.");
        // }(x<5);
        // IBIO.output(x);

        for(int i=0; i<x; i++)
        {
            int num = IBIO.inputInt("Enter number: ");
        }

  
      
        
	}
}
