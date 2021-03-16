public class ps62		 {
	 
	
	public static String stars(int n)
	{	String stars = "";
		for (int i = 0; i < n; i++)
			stars = stars + "* ";
		return stars;
	}
	public static void main (String[] args)
	{
		int num = IBIO.inputInt("enter the number of lines ");
		String aa = stars(num);
				for(int i = 0; i < num; i++)
			IBIO.output(stars(i) + aa);
		for(int i = num-1; i > 0; i--)
			IBIO.output(stars(i) + aa);

	}
	 
}
