import java.util.*;

public class Trapezoidal_rule_solution {

    // Method for the calculation of functional value for different values of x
    public static double functionalValue(double x) {
        double fx = x; // Enter fx ********************** in this line (you can take algebraic function also like this fx=1/x;)
        
        
        return fx;
    }

    public static double fVOfDefiniteIntegral(double arr[], int n, double h) {
        double fValue = 0;
        double calcValue = 0;
        for (int i = 0; i < n - 1; i++) {
            calcValue = calcValue + arr[i + 1];
        }
        fValue = h * (((arr[0] + arr[n]) / 2) + calcValue);

        return fValue;
    }

    // Calculation part
    public static void evaluateIntegral(double a, double b, int n) {
        double h = (b - a) / n;
        System.out.println("Value of h = " + h);

        double x_0 = a;

        double arr[] = new double[n + 1];
        arr[0] = functionalValue(x_0);

        for (int i = 1; i <= n; i++) {
            x_0 = x_0 + h; // Inputs for the functional value(like x1,x2,x3,x4.......upto xn)
            double f_x = functionalValue(x_0);
            arr[i] = f_x;
        }

        System.out.println("Here are the values of y0 to y" + n + ":");
        for (int i = 0; i <= n; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Final evaluated value = " + fVOfDefiniteIntegral(arr, n, h));

    }

    // main function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double a, b;
        int n;

        System.out.print("Enter the lower limit of integral: ");
        a = sc.nextDouble();
        System.out.print("Enter the upper limit of integral: ");
        b = sc.nextDouble();
        System.out.print("Enter the value of interval n: ");
        n = sc.nextInt();

        evaluateIntegral(a, b, n);
    }
}