import java.util.*;

/* OPTIMISED METHOD FOR FINDING A NUMBER IS PRIME OR NOT */
public class prime_numberTesting_using_function {

    public static boolean is_prime(int number) {
        int count = 0;
        boolean isPrime=false;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        if(count==2){
            return isPrime=true;
        }

        return isPrime;

        
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number for testing prime or not:");
        int number = sc.nextInt();

        System.out.println(is_prime(number));
    }
}


/* ANOTHER METHOD FOR TESTING PRIME NUMBER */
// public class prime_numberTesting_using_function {

//     public static boolean is_prime(int n) {

//         boolean isPrime = true;

//         if(n==1){
//             return isPrime=false;
//         }

//         for (int i = 2; i <= n - 1; i++) {
//             if (n % i == 0) {
//                 isPrime = false;
//                 break;
//             }
//         }

//         return isPrime;

//     }

//     public static void main(String args[]) {

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter any number for testing prime?:");
//         int n = sc.nextInt();
//         System.out.println(is_prime(n));

//     }
// }