import java.util.*;

public class Maxwater_in_the_container{

    public static int calculation(ArrayList<Integer> height){
        int maxWater=0;
        int lp, rp;
        lp=0;
        rp=height.size()-1;
        int currentWater;
        int ht, wt;

        while(lp<rp){
            ht=Math.min(height.get(lp), height.get(rp));
            wt=rp-lp;
            currentWater=ht*wt;

            if(height.get(lp)<height.get(rp)){
                lp++;
            }

            else{
                rp--;
            }

            maxWater=Math.max(currentWater, maxWater);
        }


        return maxWater;
    }
    public static void main(String args[]){
        ArrayList<Integer> height=new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println("The area out of the box is equal to: ");
        System.out.println(calculation(height));
    }
}