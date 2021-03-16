public class seventytwo
{
    static String align(double number, int width)
	{
		// use the indexOf method in this method (align)
		// as suggested in the worksheets
		String aligned = "" + number;
		while ( aligned.length() < width )
		{	aligned = " " + aligned;
		}
		return aligned;
	}
	
	// removes all decimals after the second one
	public static double truncate(double x)
	{
		int t = (int)(x*100);
		return (double)t/100;
	} 
   
   
   
    public static void main(String[] args)
	{
		int w = 10;		// width for alignment=10 spaces
		double xx = 1;	// used to calculate output values
		for ( int i = 0 ; i < 10; i++)
		{
			//xx = truncate(xx * 3.732);
			xx = xx * 3.732;
			String s = align(xx, w);
			IBIO.output( s );
		}
	}

}