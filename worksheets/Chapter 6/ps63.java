public class ps63		 {
	 
public static String spaces(int n)
	{	String spaces = "";
		for (int i = 0; i < n; i++)
			spaces = spaces + " ";
		return spaces;
	}
	
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
		for(int i = num-1; i > 0; i--)
			IBIO.output(spaces(i) + aa);
		for(int i = 0; i < num; i++)
			IBIO.output(spaces(i) + aa);
	}
	 
}
