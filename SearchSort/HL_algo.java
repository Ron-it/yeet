
import java.util.Arrays;
import java.util.Stack;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s510
 */
public class HL_algo {
    // default version: return the first occurrence
    // return -1 if not found, otherwise index position
    public static int linearSearch(int[] A, int searchValue) {
        for (int i = 0; i <= A.length - 1; i++) {
            if (A[i] == searchValue)
                return i;
        }
        return -1;
    }

    // version 2: return the last occurrence
    // return -1 if not found, otherwise index position
    public static int linearSearchV2(int[] A, int searchValue) {
        for (int i = A.length - 1; i >= 0; i = i - 1) {
            if (A[i] == searchValue)
                return i;
        }
        return -1;
    }

    public static int linearSearchV3(int[] A, int searchValue) {
        int foundPos = -1;
        int i = A.length - 1;
        // will only continue searching if
        // 1) there are still more elements to be examined AND
        // 2) the searchValue hasn't been found
        while (i >= 0 && foundPos == -1) {
            System.out.println("i is " + i + " same? " + (A[i] == searchValue));
            if (A[i] == searchValue) {
                foundPos = i; // foundPos changed to non-negative if found
            }
            i = i - 1;
        }
        return foundPos;
    }

    public static int linearSearchV4(int[] A, int searchValue) {
        int foundPos = -1;
        int i = A.length - 1;
        boolean isFound = false;
        // will only continue searching if
        // 1) there are still more elements to be examined AND
        // 2) the searchValue hasn't been found
        while (i >= 0 && !isFound) {
            System.out.println("i is " + i + " same? " + (A[i] == searchValue));
            if (A[i] == searchValue) {
                foundPos = i;
                isFound = true; // isFound becomes true if searchValue is found
            }
            i = i - 1;
        }
        return foundPos;
    }

    public static void selectionSort(int[] a) {
        int n = a.length;
        // find and put the largest element in the last position and so on
        // each time focus on subarray of size k from the beginning
        for (int k = n; k >= 2; k--) {
            int maxPos = 0;
            for (int i = 1; i < k; i++) {
                if (a[i] > a[maxPos])
                    maxPos = i;
            }
            int tmp = a[k - 1];
            a[k - 1] = a[maxPos];
            a[maxPos] = tmp;

            System.out.printf("k = %2d, maxPos = %2d ", k, maxPos);
            String done = (k == 2) ? " done" : "";
            System.out.println(Arrays.toString(a) + done);
        }
    }

    public static int binarySearch(int[] a, int target) {
        int left = 0;
        int right = a.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (target == a[middle])
                return middle;
            else if (target < a[middle])
                right = middle - 1;
            else
                left = middle + 1;
        }
        return -1; // not found
    }

    // e.g. 30 -> 11110 (16+8+4+2)
    public static void printBinaryValue(int num) {
        Stack<Integer> S = new Stack<Integer>();
        while (num > 0) {
            int digit = num % 2;
            num = num / 2; // if both operands are integer, mod is applied
            S.push(digit);
            // System.out.print(digit);
        }
        while (S.empty() == false) {
            System.out.print(S.pop());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] A = { 12, 15, 9, 15, 15, 26 };
        int target = 15;
        System.out.println(linearSearchV4(A, target));

        /*
         * printBinaryValue(30); printBinaryValue(3825);
         */
    }
}
