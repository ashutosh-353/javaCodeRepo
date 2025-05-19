import java.util.*;

public class hollow_rectangle_pattern {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of lines for the hollow rectangle pattern:");
    int n = sc.nextInt();

    for (int rows = 1; rows <= n; rows++) {         // Loop for the total number of rows

      if (rows == 1 || rows == n) {           // Condition for 1st and last row of the rectangle because they both have same

        // number of stars
        for (int i = 1; i <= n + 1; i++) {
          System.out.print("*  ");

        }
      } else {                        //Condition for other rows of hollow rectangle
        System.out.print("*  "); 

        for (int i = 1; i <= n - 1; i++) {
          System.out.print("   ");
        }
        System.out.print("*  ");
      }
      System.out.println(); // for next line
    }

  }
}