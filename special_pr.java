import java.util.*;

public class special_pr{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int sum_even=0;
        int sum_odd=0;

        System.out.println("Enter any ten numbers randomly:");
        for(int i=1; i<=10; i++){
            int n=sc.nextInt();
            System.out.println(i+"th Integer is:"+n);

            if(n%2==0){
                
                sum_even=sum_even+n;
            }

            if(n%2!=0){
                
                sum_odd=sum_odd+n;

                
            }
        }

        System.out.println("The sum of even numbers is:"+sum_even);
        System.out.println("The sum of odd numbers is:"+sum_odd);


    }
}