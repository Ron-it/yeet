public class arrch2 {
	
	public static void main (String [] args) 
	{
        int a[] = {9 , 8 , 7 , 6 , 5 , 4 , 3, 2, 1};


            System.out.print("The odd numbers in this list of array are: ");
            
        for(int i = 0; i<a.length; i++){
            if(a[i] %2 !=0){
                System.out.print(a[i] + "; ");
            }
        }

    }
}