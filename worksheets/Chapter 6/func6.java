public class func6 {
	
	public static void main (String[] args) 
{ int num = IBIO.inputInt("enter number of lines ");
String aa = stars(num);
for (int i = 0; i < num; i++)
IBIO.output(aa);
}

static String stars(int n)
			{ String xx = "          "; //(10 spaces 6.1)
		for (int i = 0; i < n; i++)
			xx = xx + "*";
			return xx;
		}
	
}
