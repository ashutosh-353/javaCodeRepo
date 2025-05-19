public class prefix_array {
    public static void prefixArray(int numbers[]) {

        int prefix_array[] = new int[numbers.length];

        prefix_array[0] = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            prefix_array[i] = prefix_array[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(prefix_array[i] + " ");
        }

    }

    public static void main(String args[]) {
        int numbers[] = { 3, 5, 2, 7, 8, 1, -4, -4, 1, 6 };

        prefixArray(numbers);
    }
}