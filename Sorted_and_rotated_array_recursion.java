public class Sorted_and_rotated_array_recursion {
    public static int search(int arr[], int target, int si, int ei) {
        if (si > ei) {
            return -1;
        }

        // Kaam
        int mid = si + (ei - si) / 2; // (si+ei)/2;

        // If Case Found
        if (arr[mid] == target) {
            return mid;
        }

        // if mid lies on L1
        else if (arr[si] <= arr[mid]) {
            // case A: left
            if (arr[si] <= target && target <= arr[mid]) {
                return search(arr, target, si, mid - 1);
            }

            // case B: right
            else {
                return search(arr, target, mid + 1, ei);
            }
        }

        // if mid lies on L2
        else {
            // case C: right
            if (arr[mid] <= target && target<=arr[ei]) {
                return search(arr, target, mid + 1, ei);
            }

            else {
                return search(arr, target, si, mid - 1);
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int tarIdx = search(arr, target, 0, arr.length - 1);
        System.out.println(tarIdx);
    }
}
