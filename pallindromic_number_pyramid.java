
public class pallindromic_number_pyramid {
    public static void main(String args[]) {

        int n = 5;
        int rows = 1;
        int str = 1;
        int spc = n - 1;

        int current_lines = rows;
        while (rows <= n) {

            for (int i = 1; i <= spc; i++) {
                System.out.print("   ");

            }

            for (int i = 1; i <= str; i++) {
                System.out.print("  " + current_lines);

                if (i <= str / 2) {
                    current_lines--;
                }

                else {
                    current_lines++;
                }
            }

            System.out.println();
            spc--;
            str = str + 2;
            rows++;
        }
    }
}