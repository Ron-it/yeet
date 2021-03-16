public class seventyone {
	
	public static void main (String[] args) 
	{	
        double xx = 1;

		for (int i = 0; i < 10; i++)
		{
			xx = xx * 3.732; // power of 3.732

			int x = (int)(xx*100); //convert to int
            
			System.out.println((double)x/100); //2 decimal places.
		}
	}
}