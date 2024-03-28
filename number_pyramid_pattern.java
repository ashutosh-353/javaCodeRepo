
public class number_pyramid_pattern {
    public static void main(String main[]) {

        int n = 9;
        int number = 1;
        int space = n-1;

        for (int rows = 1; rows <= n; rows++) {
            // for spaces
            for (int i = 1; i <= space; i++) {
                System.out.print(" ");
            }

            // for printing numbers
            for (int i = 1; i <= rows; i++) {
                System.out.print(" "+number);

            }

            

            // for spaces
            for (int i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            
            System.out.println();
            space--;
            number++;

        }
    }
}