import java.util.*;
import java.io.*;

public class hollow_rhombus_pattern {
    public static void main(String main[]) {
        Scanner sc = new Scanner(System.in);
        int n = 5;

        int star = 5;
        int space = n - 1;

        for (int rows = 1; rows <= n; rows++) {
            if (rows == 1) {
                for (int i = 1; i <= space; i++) {
                    System.out.print("  ");
                }

                for (int i = 1; i <= star; i++) {
                    System.out.print("* ");
                }

            }

            else if (rows == n) {
                for (int i = 1; i <= star; i++) {
                    System.out.print("* ");
                }

            }

            else {

                for (int i = 1; i <= space; i++) {
                    System.out.print("  ");
                }
                
                System.out.print("* ");

                for (int i = 1; i <= star - 2; i++) {
                    System.out.print("  ");
                }
                
                System.out.print("* ");
            }

            space--;
            System.out.println();

        }

    }
}