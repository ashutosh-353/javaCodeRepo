
public class the_0_1_pattern {
    public static void main(String args[]) {
        int n = 1;

        for (int rows = 1; rows <= 5; rows++) {


            if (rows == 1 || rows == 3 || rows == 5) {

                for (int i = 1; i <= rows; i++) {
                    System.out.print(n + " ");
                    n = 1 - n;
                }

                
            }

            else{
                 for (int i = 1; i <= rows; i++) {
                    System.out.print(n + " ");
                    n = 1 - n;
                }
                n=1-n;
            }

            System.out.println();
        }

    }
}