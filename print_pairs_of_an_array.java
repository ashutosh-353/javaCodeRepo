public class print_pairs_of_an_array {
    public static void printPairs(int ok[]) {
        int start = 0;
        int end = 1;
        for (int i = 1; i < ok.length; i++) {
            for (int j = i; j < ok.length; j++) {
                System.out.print("(" + ok[start] + "," + ok[end] + ")");
                end++;
            }
            System.out.println();
            start++;
            end = start + 1;
        }
    }

    public static void main(String args[]) {

        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        printPairs(numbers);

    }
}