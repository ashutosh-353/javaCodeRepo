import java.util.*;

public class Two_pointer_approach{
    public static int area(ArrayList<Integer> height){
        int lp, rp;
        int ht, wt;
        int maxWater=0, currentWater;
        lp=0;
        rp=height.size()-1;

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

        System.out.println("Area out of the box is: ");
        System.out.println(area(height));
        
    }
}