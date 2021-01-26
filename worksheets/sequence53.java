/* Write a program that will add up the sequence discussed above to 10,000 terms. Output 4 times
the answer to get pi. (3.1414926535900345) */
public class sequence53 {
	
	public static void main (String[] args) 
	{
		double term = 1;
		int sign = 1;
		for (double i = 1 ; i <= 10000 ; i++)
		{ IBIO.output(sign * term);
		term = term + 3;
		sign = sign * -1;
		System.out.println("the sum is" + sign}
	}
}
