public class CSTest {
	
	public static void main (String[] args) 
	{
        System.out.println("Ronit");

        int n1 = 0;
        int n2 = 1;
        int n;
        int n3 = n1+n2;
        int sum = 0; 
        double average = 0;


        do{
            {
                n = IBIO.inputInt("\nCalculate up to term (n): ");

        if (n<0)

        {
            System.out.println("Error - enter a positive number");
        }
        System.out.print(n1 + "; ");
        System.out.print(n2 + "; ");
		while( n3 <= n )
		{
			if( n3 <= n )
			{
				System.out.print( n3 + "; ");
			}
			n1 = n2;
            n2 = n3;
            sum = sum+n3;
            n3 = n1 + n2;
            sum=sum+n;
		}
            }


            if (n==0){
            System.exit(0);
            }
        }while(n!=0);


        if (n>20);
        {
            System.out.println("Term"+n+": ");
            
        }

        average = (double)sum/n;
        System.out.println(sum);
        System.out.println(average);

}

}


