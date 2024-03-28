import java.util.*;

public class Oops_forDifferentOperationsOn_twoComplexNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Complex c1 = new Complex();
        System.out.println("Enter value of parameters of the two complex numbers in x+iy format like 1st x then y respectively:");
        c1.sum(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());

        
        Complex c2 = new Complex();
        System.out.println("Enter value of parameters of the two complex numbers in x+iy format like 1st x then y respectively:");
        c2.difference(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());


        Complex c3 = new Complex();
        System.out.println("Enter value of parameters of the two complex numbers in x+iy format like 1st x then y respectively");
        c3.product(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());

    }
}

class Complex {

   public void sum(int x, int y, int x2, int y2) {
        int real_sum = x + x2;
        int img_sum = y + y2;

        if(img_sum<0){
            System.out.println("Sum of these two complex numbers is " + real_sum + img_sum + "i");
            }
            else{
                System.out.println("Sum of these two complex numbers is " + real_sum + "+" + img_sum + "i");
            }
    }

    public void difference(int x, int y, int x2, int y2) {
        int real_sum = x - x2;
        int img_sum = y - y2;

        if(img_sum<0){
        System.out.println("Difference of these two complex numbers is " + real_sum + img_sum + "i");
        }
        else{
            System.out.println("Difference of these two complex numbers is " + real_sum + "+" + img_sum + "i");
        }
    }

    public void product(int x, int y, int x2, int y2) {
        int r_r=x*x2;
        int r_i=x*y2;
        int i_r=y*x2;
        int i_i=-(y*y2);

        int real_part=r_r+i_i;
        int img_part=r_i+i_r;

        if(img_part<0){
            System.out.println("Product of these two complex numbers is " + real_part + img_part + "i");
        }
        else{
            System.out.println("Product of these two complex numbers is " + real_part +"+"+ img_part + "i");
        }
    }

}
