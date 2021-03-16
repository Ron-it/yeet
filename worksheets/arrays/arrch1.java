public class arrch1 {
	
	public static void main (String [] args) 
	{
            int array[] = {9 , 8 , 7 , 6 , 5 , 4 , 3, 2, 1};
            int b[] = new int[array.length];
            int max = array.length - 1;
            int sum = 0;

            for(int i = 0; i < array.length; i++)
            {
                b[i] = array[max - i];
            }
                    System.out.println("Array b: ");

            for(int i = 0; i < array.length; i++)
            {
                    System.out.println(b[i]);

                sum = sum+b[i];
            }
                    System.out.println("The sum of the arrays is: " +  sum);
        }
    }