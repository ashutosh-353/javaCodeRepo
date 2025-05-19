import java.util.*;

public class Array2D_creation_and_searching_of_a_key {

    // Function for Searching for a Key in the inputed 2d array
    public static boolean searchKey(int arr[][], int key, int n, int m) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == key) {

                    System.out.println("Key found at " + "(" + i + "," + j + ")");
                    return true;
                }
            }

        }
        System.out.println("There is nothing(key) in this 2d array");
        return false;
    }

    public static void main(String args[]) {
        int arr[][] = new int[5][4];
        Scanner sc = new Scanner(System.in);

        int n = arr.length; // No of rows
        int m = arr[0].length; // No of columns

        System.out.println("Enter the values for the creation of 2d array:");
        // Input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }

        }

        System.out.println("The 2D array is:");

        // Output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int key = 5; // Key Input

        searchKey(arr, key, n, m);

    }
}