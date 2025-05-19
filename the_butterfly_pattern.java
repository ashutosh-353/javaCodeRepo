import java.util.*;

public class the_butterfly_pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Total number of rows
        System.out.print("Enter no. of rows:");
        int n = sc.nextInt();

        int str=1;
        int spc=n-2;
        for(int rows=1; rows<=n/2+1; rows++){


            if(rows==n/2+1){
                for(int i=1; i<=n; i++){
                    System.out.print("* ");
                }
            }

            else{
            for(int i=1; i<=str; i++){
                System.out.print("* ");
            }

            for(int i=1; i<=spc; i++){
                System.out.print("  ");
            }
            for(int i=1; i<=str; i++){
                System.out.print("* ");
            }
        }

            str++;
            spc=spc-2;
            System.out.println();

            
        }


        //For the lower part of the pattern
        int str1 = n/2;
        int spc1 = 1;
        for (int rows = 1; rows <= n/2; rows++) {
            for (int i = 1; i <= str1; i++) {
                System.out.print("* ");
            }
            for (int i = 1; i <= spc1; i++) {
                System.out.print("  ");
            }

            for (int i = 1; i <= str1; i++) {
                System.out.print("* ");
            }

            str1--;
            spc1 = spc1 + 2;
            System.out.println();

        }


    }
}