import java.util.*;

public class printing_prime_numbers {

    /*EXECUTING FUNCTION*/
    public static void printPrimeNumbers(int n){
        
        System.out.println("The prime numbers between 1 and"+" "+n+" are:");
        for(int i=1; i<=n; i++){
            if(is_prime(i)==true){
                System.out.println(i);
            }
        
        }
    }


    // HELPING FUNCTION--->
    public static boolean is_prime(int number) {
        int count = 0;
        boolean isPrime = false;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            return isPrime = true;
        }

        return isPrime;
    }

    
    /*MAIN FUNCTION*/
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number:");
        int n=sc.nextInt();
        printPrimeNumbers(n);
    }
}