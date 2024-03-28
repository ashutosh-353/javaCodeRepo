import java.util.*;
import java.io.*;
import java.lang.*;

public class solid_rhombus_pattern {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = 4;

        int star = 4;
        int space = n - 1;

        for (int rows = 1; rows <= n; rows++) {
            // for spaces

            for (int i = 1; i <= space; i++) {
                System.out.print("  ");

            }

            // for stars

            for (int i = 1; i <= star; i++) {
                System.out.print("*  ");
            }

            System.out.println();

            space--;

        }

    }
}