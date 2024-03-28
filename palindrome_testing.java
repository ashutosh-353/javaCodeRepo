import java.util.*;

public class palindrome_testing {
    public static boolean isPalindrome(int n) {
        int reverse = 0;
        int original_number = n;
        for (; n > 0;) {
            int last_digit = n % 10;
            reverse = last_digit + reverse * 10;
            n = n / 10;
        }

        if (reverse == original_number) {
            return true;
        }

        return false;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 3 digit number or above:");
        int n = sc.nextInt();

        boolean res = isPalindrome(n);
        System.out.println(res);
    }
}