import java.util.*;

public class Pairsum_using_wrapperClass{

    public static boolean pairSum(ArrayList<Integer> array, int targetSum, Wrapper i, Wrapper2 j){
        int currentSum;

        for(i.value=0; i.value<array.size(); i.value++){

            for(j.value=i.value+1; j.value<array.size(); j.value++){
                currentSum=array.get(i.value)+array.get(j.value);

                if(currentSum==targetSum){
                    return true;
                }
            }
        }

        return false;
    }


    public static void main(String args[]){
        ArrayList<Integer> array=new ArrayList<>();
        Wrapper i=new Wrapper(0);
        Wrapper2 j=new Wrapper2(0);

        array.add(6);
        array.add(7);
        array.add(8);
        array.add(9);
        array.add(10);

        int targetSum=18;

        boolean response=pairSum(array, targetSum, i, j);

        if(response==true){
            System.out.println("Required pair is:");
            System.out.println("("+array.get(i.value)+", "+array.get(j.value)+")");

        }

        else{
            System.out.println("There is no such pair exists");
        }

    }
}


class Wrapper{
    public int value;

    public Wrapper(int value){
        this.value=value;
    } 

}

class Wrapper2{
    public int value;

    public Wrapper2(int value){
        this.value=value;
    }
}