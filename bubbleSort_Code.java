public class bubbleSort_Code {
    // Function-1
    public static void bubble_sort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // SWAP
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    // Function-2
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    // Main function
    public static void main(String args[]) {
        int arr[] = { 5, 2, 3, 1, 4 };
        bubble_sort(arr);
        printArr(arr);
    }
}