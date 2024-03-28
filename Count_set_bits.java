import java.util.*;

public class Count_set_bits {

    public static int countSetBits(int number) {
        int count = 0;

        while (number > 0) {
            if ((1 & number) != 0) {
                count++;
            }

            number = number >> 1;
        }
        return count;
    }

    public static void main(String bitManipulation[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number:");
        int n = sc.nextInt();
        int res = countSetBits(n);

        System.out.println("Total number of set bits in this number is " + res);
    }
}