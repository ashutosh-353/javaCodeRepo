import java.util.*;

public class linear_search {                          /* FINDING LARGEST NUMBER IN AN ARRAY */

    public static int findLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }

        return largest;                   
    }

    public static void main(String args[]) {
        int numbers[] = { 5, 7, 8, 300, 5, 11, 45, 23, 6, 1, 9 };

        int res = findLargest(numbers);
        System.out.println("The largest number in this array is: " + res);

    }
}