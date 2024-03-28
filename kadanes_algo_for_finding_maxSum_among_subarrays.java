/* KADANES ALGORITHM FOR FINDING THE MAXIMUM SUM OF A SUBARRAY IN AN ARRAY */
/*It is not applicable on the arrays that contain all -ve numbers*/

public class kadanes_algo_for_finding_maxSum_among_subarrays {
    public static void kadanes(int numbers[]) {

        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            current_sum = numbers[i] + current_sum;

            if (current_sum < 0) {
                current_sum = 0;
            }

            if (current_sum > max_sum) {
                max_sum = current_sum;
            }
        }

        System.out.println("Max sum is:" + max_sum);
    }

    public static void main(String args[]) {
        int numbers[] = { -2, -3, 4, -1, -2, 1, 3, -3 };
        kadanes(numbers);
    }
}