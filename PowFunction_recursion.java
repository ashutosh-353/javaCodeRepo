import java.util.*;

public class PowFunction_recursion {

    public static int powFunc(int a, int n) {

        if(n==0){
            return 1;
        }
        int halfPowerSq = powFunc(a, n / 2) * powFunc(a, n / 2);

        if (n % 2 != 0) {
            return halfPowerSq * a;

        }

        return halfPowerSq;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int a = sc.nextInt();

        System.out.print("Enter power:");
        int n = sc.nextInt();

        

        System.out.println(powFunc(a, n));

    }
}
