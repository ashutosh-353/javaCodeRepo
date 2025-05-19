public class the_subarrays_of_an_array {
    public static void print_subarrays_of_an_array(int numbers[]) {
        int start = 0;
        int end = 1;
        int var = 0;

        for (int i = 1; i <= numbers.length; i++) {

            for (int j = i; j <= numbers.length; j++) {

                for (int k = 0; k < end; k++) {
                    System.out.print(numbers[start] + " ");
                    start++;
                }
                System.out.println();
                end++;
                start = var;

            }
            System.out.println();
            start = i;
            end = 1;
            var++;
        }
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18 };
        print_subarrays_of_an_array(numbers);
    }
}
