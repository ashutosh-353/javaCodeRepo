import java.util.*;

public class Binary_to_decimal_conversion {
    public static void binToDecimal(long binN) {
        long decimalN = 0;
        long number = binN;
        int power = 0;
        long lastDigit;
        while (binN != 0) {
            lastDigit = binN % 10;
            decimalN = decimalN + (lastDigit * (long) Math.pow(2, power));
            binN = binN / 10;
            power++;
        }
        System.out.print("Conversion of " + number + " to decimal number is: " + decimalN);
    }

    public static void main(String args[]) {
        System.out.print("Enter any number in binary format:");
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();

        binToDecimal(n);

    }
}