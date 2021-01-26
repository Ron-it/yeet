public class sequence51 {
	
	public static void main (String[] args) 
	{

		double term = (0.2);
		double sum = 0;
		for (int i = 0; i < 100; i++)
		{ 	
			sum = sum + term;
			term = term / 5;
		}
		IBIO.output("total is " + sum);
	}
}
