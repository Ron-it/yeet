public class pt4 {

    public static void main(String[] args) {
        int[] x = { 21, 35, 9, 46, 11, 18, 39 };
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length - 1; j++) {
                if (x[j] > x[j + 1]) {
                    int temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < x.length; i++) {
            IBIO.out(x[i] + " ");
        }
    }
}

/*
 * int minIndex = 0;
 * 
 * for (int i = 1; i <scores.length; i++) { if(scores[i]<scores[minIndex]){
 * minIndex = scores[i]; } } IBIO.output(names[minIndex]);
 */

/*
 * --------------------------------------------------------------------------
 * int[] arr = { 5, 73, 7, 14, 8 }; int searchvalue =
 * IBIO.inputInt("Please enter the search value: "); int index = -1;
 * 
 * for (int i = 0; i < arr.length; i++) {
 * 
 * if (arr[i] == searchvalue) { index = i; } } if (index == -1) {
 * IBIO.output("Value not present in array"); }
 * 
 * else { IBIO.output("The value is found at: " + index); }
 * --------------------------------------------------------------------------
 */

/*
 * int[] arr = { 34, 67, 74, 45, 67 }; int searchvalue =
 * IBIO.inputInt("Please enter the search value: "); boolean found = false; int
 * index = -1; int i = 0; while (i < arr.length && found == false) { if (arr[i]
 * == searchvalue) { found = true; index = i; } i++; }
 * 
 * if (found == false) { IBIO.output("Value not found in the array"); }
 * 
 * else { IBIO.output("Value is found at index " + index); }
 */

/*
 * int[] num1 = { 45, 67, 89, 95, 99 }; int searchVal =
 * IBIO.inputInt("Please enter the search value: "); int low = 0, high =
 * num1.length - 1; int index = -1; int mid;
 * 
 * while (low <= high && index == -1) { mid = (low + high) / 2; if (num1[mid] ==
 * searchVal) { index = mid; } else if (num1[mid] > searchVal) { high = mid - 1;
 * } else { low = mid + 1; } IBIO.output("The value of low is " + low);
 * IBIO.output("The value of high is " + high); } if (index == -1) {
 * IBIO.output("not found"); } else { IBIO.output("Value found at index " +
 * index); }
 */

/*
 * int[] num1 = { 99, 95, 89, 67, 45 }; int searchVal =
 * IBIO.inputInt("Please enter the search value: "); int low = 0, high =
 * num1.length - 1; int index = -1; int mid;
 * 
 * while (low <= high && index == -1) { mid = (low + high) / 2; if (num1[mid] ==
 * searchVal) { index = mid; } else if (num1[mid] < searchVal) { high = mid - 1;
 * } else { low = mid + 1; } IBIO.output("The value of low is " + low);
 * IBIO.output("The value of high is " + high); } if (index == -1) {
 * IBIO.output("not found"); } else { IBIO.output("Value found at index " +
 * index); } }
 */

/*
 * int[] array = { 48, 20, 18, 15, 37, 94, 45, 11, 39, 8, 16, 13, 65 }; int n =
 * array.length; //bubble sort
 * 
 * for (int i = 0; i <= n - 1; i++) { for (int j = 0; j <= n - 2; j++) { if
 * (array[j] < array[j + 1]) { int temp = array[j]; array[j] = array[j + 1];
 * array[j + 1] = temp; } } print(array); } IBIO.output("Improved Version 1");
 * for (int i = 0; i <= n - 1; i++) { for (int j = 0; j <= n - 2 - i; j++) { if
 * (array[j] < array[j + 1]) { int temp = array[j]; array[j] = array[j + 1];
 * array[j + 1] = temp; } } print(array); } IBIO.output("Improved Version 2");
 * boolean swap = true; int i = 0;
 * 
 * while (i <= n - 1 && swap == true) {
 * 
 * swap = false; for (int j = 0; j <= n - 2; j++) { if (array[j] < array[j + 1])
 * { int temp = array[j]; array[j] = array[j + 1]; array[j + 1] = temp; swap =
 * true; } } i++; print(array); }
 * 
 * }
 * 
 * public static void print(int[] array) { for (int i = 0; i < array.length;
 * i++) { IBIO.out(array[i] + " "); } IBIO.output("");
 */

/*
 * int[] array = { 80, 70, 60, 50, 40, 30, 20, 10 }; //selection sort
 * 
 * print(array);
 * 
 * for (int i = 0; i < array.length; i++) { int maxindex = i; for (int j = i +
 * 1; j < array.length; j++) { if (array[j] < array[maxindex]) { maxindex = j;
 * 
 * } }
 * 
 * int temp = array[maxindex]; array[maxindex] = array[i]; array[i] = temp;
 * print(array); }
 * 
 * }
 * 
 * public static void print(int[] array) { for (int i = 0; i < array.length;
 * i++) { IBIO.out(array[i] + " "); } IBIO.output(""); }
 */

/*
 * int[] array = { 39, 12, 36, 11, 98, 67, 78, 84 }; //insertion sort int n =
 * array.length;
 * 
 * for (int i = 1; i < n; i++) { int key = array[i]; int j = i - 1;
 * 
 * while (j >= 0 && array[j] > key) { array[j + 1] = array[j]; j = j - 1; }
 * array[j + 1] = key; for (int k = 0; k < array.length; k++) {
 * IBIO.out(array[k] + " ");
 * 
 * } IBIO.output("");
 * 
 * }
 */

/*
 * int[] arr = { 23, 13, 46, 21, 23, 18 }; // linear search duplicate array int
 * target = IBIO.inputInt("Please enter a target number: "); boolean found =
 * false;
 * 
 * for (int i = 0; i < arr.length; i++) { if (arr[i] == target) {
 * IBIO.output("Value found at position: " + i); found = true; } }
 * 
 * if (found == false) { IBIO.output("Value not found"); }
 */

/*
 * int[] arr = { 23, 13, 46, 21, 23, 18, 15, 37 };//linear search in a non
 * duplicate array int target = IBIO.inputInt(); boolean found = false; int i =
 * 0;
 * 
 * while (i < arr.length && found == false) { if (arr[i] == target) {
 * IBIO.output("Value found at position: " + i); found = true; } i = i + 1; } if
 * (found == false) { IBIO.output("Value not found"); }
 */

/*
 * int[] array = { 13, 23, 29, 35, 46, 65, 89, 90 };//binary sort only for
 * sorted arr int target = IBIO.inputInt(); boolean found = false; int low = 0;
 * int high = array.length - 1; int mid = 0;
 * 
 * while (low <= high && found == false) { mid = (low + high) / 2; if (target ==
 * array[mid]) { IBIO.output("Value found at position: " + mid); found = true; }
 * else if (target > array[mid]) { low = mid + 1; } else { high = mid - 1; } }
 * if (found == false) { IBIO.output("Value not found"); }
 */