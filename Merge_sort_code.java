public class Merge_sort_code {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; // Index for 1st sorted part
        int j = mid + 1; // Index for 2nd sorted part
        int k = 0; // Starting index for temperary array

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            }

            else {
                temp[k] = arr[j];
                j++;
            }
            k++;

        }

        // For leftover elements of 1st sorted part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // For leftover elements of 2nd sorted part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy temp[] to original arr[]
        for (k = 0, i = si; k < temp.length; i++, k++) {
            arr[i] = temp[k];
        }

    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);

        merge(arr, si, mid, ei);

    }

    public static void main(String args[]) {
        int arr[] = { 2, 1, 9, 7, 4, 10, 19, 14 };
        int si = 0;
        int ei = arr.length - 1;
        mergeSort(arr, si, ei);

        printArray(arr);

    }
}