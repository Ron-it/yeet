/* Write a program that will add up the sequence discussed above to 10,000 terms. Output 4 times
the answer to get pi. (3.1414926535900345) */
public class sequence54 {
	
	public static void main (String[] args) 
	{
		double term = 1;
		double sign = 1;
		double eq = 1;
		for (double i = 1 ; i <= 100 ; i++)
		{ 
			sign = sign*sign + 1;
			term = 1/term*term+2;
			eq = sign/term	;
		}
		System.out.println("the sum is " + eq);
		}
	
}
