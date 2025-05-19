
public class diamond_pattern {
    public static void main(String args[]) {

        // Upper Half
        int n = 18;
        int space = n - 1;

        for (int rows = 1; rows <= n; rows++) {
            int star = 2 * rows - 1;
            // for spaces
            for (int i = 1; i <= space; i++) {
                System.out.print("  ");
            }

            // for stars
            for (int i = 1; i <= star; i++) {
                System.out.print("* ");
            }

            // for spaces
            for (int i = 1; i <= space; i++) {
                System.out.print("  ");
            }

            System.out.println();
            space--;

        }

        // Lower Half
        space = 0;
        int star = 2 * n - 1;
        for (int rows = 1; rows <= n; rows++) {

            // for spaces
            for (int i = 1; i <= space; i++) {
                System.out.print("  ");
            }
            // for stars
            for (int i = 1; i <= star; i++) {
                System.out.print("* ");
            }
            // for spaces
            for (int i = 1; i <= space; i++) {
                System.out.print("  ");
            }

            space++;
            star = star - 2;
            System.out.println();

        }
    }
}