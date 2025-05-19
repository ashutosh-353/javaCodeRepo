import java.util.*;

public class sum_of_digits {
    public static long sumOfDigits(long n) {
        long sum = 0;
        long last_digit;
        for (; n > 0;) {
            last_digit = n % 10;
            sum = sum + last_digit;
            n = n / 10;
        }
        return sum;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        long n = sc.nextLong();

        long sum = sumOfDigits(n);
        System.out.println("sum of digits:" + sum);
    }
}
