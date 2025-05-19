public class the_reverse_of_an_array {
    public static void printing_the_reverse(int numbers[]) {

        int start = 0;
        int end = numbers.length - 1;
        int temp;

        for (int i = 1; i <= numbers.length / 2; i++) {
            temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }

        System.out.println("Here is the reverse of the given array:");
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };

        printing_the_reverse(numbers);

    }
}
