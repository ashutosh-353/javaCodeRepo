public class Optimised_bubble_sort_code {

    public static void modifiedBubbleSort(int arr[]) {
        for (int turn = 0; turn <= arr.length - 1; turn++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swapping
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }

            }
            if (swapped == false) {
                break;
            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }

    }

    public static void main(String args[]) {
        int arr[] = { 4, 8, 7, 6, 5, 3, 2, 1 };

        modifiedBubbleSort(arr);

    }
}
