import java.util.*;

public class binary_search {

    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;
        int mid;

        while (start <= end) {
            mid = (start + end) / 2;

            if (numbers[mid] == key) {
                return mid;
            } else if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1; /* BINARY SEARCH IN JAVA */
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 3, 4, 6, 5, 7, 10, 8, 9 };

        System.out.print("Enter the value of key:");
        Scanner sc = new Scanner(System.in);

        int key = sc.nextInt();
        int res = binarySearch(numbers, key);

        if (res == -1) {
            System.out.println("Key is not present in the given array");
        } else {
            System.out.println("Key is at index no. " + res);
        }

    }
}
