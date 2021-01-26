/* Write a program that it adds up the sequence
1/1 + 1/4 + 1/9 + 1/16 + 1/25 + … for 100 terms (1.6348839001848923) */
public class sequence52 {
	
	public static void main (String[] args) 
	{

		double term = 1;
		double sum = 0;
    	for(double i = 2; i <= 101; i++)

		{

		    sum = sum + term;

		    term = 1/(i*i);

		}
		IBIO.output("total is " + sum);
	}
}
