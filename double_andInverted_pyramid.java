import java.util.*;
import java.lang.*;
import java.io.*;

public class double_andInverted_pyramid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines to be printed for the pattern:");
        int n = sc.nextInt();

        int spc = 1;
        int str = 2 * ((n / 2) + 1) - 3;
        for (int rows = 1; rows <= ((n / 2) + 1); rows++) {
            if (rows == 1) {
                for (int i = 1; i <= (2 * ((n / 2) + 1) - 1); i++) {
                    System.out.print("* ");
                }
            }

            else {
                for (int i = 1; i <= spc; i++) {
                    System.out.print("  ");
                }

                for (int i = str; i >= 1; i--) {
                    System.out.print("* ");

                }

                str = str - 2;

                for (int i = 1; i <= spc; i++) {
                    System.out.print("  ");
                }
                spc++;

            }
            System.out.println();

        }

        spc = n / 2 - 1;
        str = 3;

        for (int rows = 1; rows <= n / 2; rows++) {
            if (rows == n / 2) {
                for (int i = 1; i <= n; i++) {
                    System.out.print("* ");
                }

            }

            else {
                for (int i = 1; i <= spc; i++) {
                    System.out.print("  ");
                }

                for (int i = 1; i <= str; i++) {
                    System.out.print("* ");
                }

                for (int i = 1; i <= spc; i++) {
                    System.out.print("  ");
                }
            }
            spc = spc - 1;
            str = str + 2;

            System.out.println();

        }

    }
}