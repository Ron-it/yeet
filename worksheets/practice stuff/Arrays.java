public class Arrays {
    public static void main(String[] args) {
}
    }

}
/*
 * int num[] = new int[10]; for(int i = 0 ; i<10 ; i++){
 * 
 * double val = Math.random()*6; int randomval = (int)(val+1); num[i] =
 * randomval;
 * 
 * }
 * 
 * for(int i = 0; i<10; i++){
 * 
 * System.out.println("The values"+num[i]);
 * 
 * }
 */// Print and store random numbers

/*
 * String s = IBIO.input("Enter the word: "); char[] x = s.toCharArray();
 * for(int i = 0; i<x.length; i++){
 * 
 * IBIO.out(x[i]);
 * 
 * } System.out.println(" "); System.out.print("Reverse of the word is: ");
 * 
 * for(int i = x.length - 1; i>=0; i--){
 * 
 * System.out.print(x[i]);
 * 
 * }
 */// Program prints and reverses a word

/*
 * int size = IBIO.inputInt("Enter the number of values: "); int[] numbers = new
 * int[size];
 * 
 * for(int i = 0; i<size; i++){
 * 
 * numbers[i] = IBIO.inputInt("Enter value: ");
 * 
 * }
 * 
 * System.out.print("The even numbers enetered in the array are: ");
 * 
 * for(int i = 0; i<size; i++){
 * 
 * if(numbers[i]%2==0){ System.out.print(numbers[i] + ", "); }
 * 
 * }
 */// Find even numbers in an array

/*
 * int max,min,range; int size = IBIO.inputInt("Enter the number of values");
 * int[] numbers = new int [size];
 * 
 * for(int i = 0; i<size; i++){ numbers[i] = IBIO.inputInt("Enter values: "); }
 * 
 * max = numbers[0]; min = numbers[0];
 * 
 * for(int i = 1; i<size; i++){ if(max<numbers[i]){ max = numbers[i]; }
 * 
 * if(min>numbers[i]){ min = numbers[i]; }
 * 
 * }
 * 
 * range = max-min;
 * 
 * System.out.println("Highest value is: " + max);
 * System.out.println("Smalles value is: " + min);
 * System.out.println("The range is: " + range);
 */
// Find max and min and range from an array

/*
 * int size = IBIO.inputInt("Enter the number of values: "); int[] numbers = new
 * int[size];
 * 
 * for(int i = 0; i<size; i++){ numbers[i] = IBIO.inputInt("Value: "); }
 * 
 * for(int i = 0; i<size; i++){ if((numbers[i]%2==0) && (numbers[i]%5==0)){
 * //divisible by 2 and divisible by 5 System.out.print(numbers[i] + "   "); } }
 */// finding mumbers div by 2 and 5