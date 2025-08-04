import java.util.*;

public class Butterfly_pattern{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter any number for rows: ");
        int n=sc.nextInt();
        
        //code for even number input rows
        if(n%2==0){


        //for upper part
        int str=1;
        int spc=n-2;
        
        for(int rows=1; rows<=n/2+1; rows++){
            if(rows==n/2+1 || rows==n/2){
                for(int i=1; i<=n; i++){
                    System.out.print(" *");
                }
            }

            else{
                for(int i=1; i<=str; i++){
                    System.out.print(" *");
                }

                for(int i=1; i<=spc; i++){
                    System.out.print("  ");
                }

                for(int i=1; i<=str; i++){
                    System.out.print(" *");
                }
            }

            str++;
            spc=spc-2;

            System.out.println();

        }


        //for lower part
        str=n/2-1;
        spc=2;

        for(int rows=1; rows<=n/2-1; rows++){
            for(int i=1; i<=str; i++){
                System.out.print(" *");
            }

            for(int i=1; i<=spc; i++){
                System.out.print("  ");
            }

            for(int i=1; i<=str; i++){
                System.out.print(" *");
            }

            str--;
            spc=spc+2;
            System.out.println();

        }



        }














    else{
        //for upper part
        int str=1;
        int spc=n-2;
        
        for(int rows=1; rows<=n/2+1; rows++){
            if(rows==n/2+1){
                for(int i=1; i<=n; i++){
                    System.out.print(" *");
                }
            }

            else{
                for(int i=1; i<=str; i++){
                    System.out.print(" *");
                }

                for(int i=1; i<=spc; i++){
                    System.out.print("  ");
                }

                for(int i=1; i<=str; i++){
                    System.out.print(" *");
                }
            }

            str++;
            spc=spc-2;

            System.out.println();

        }



        //for lower part
        str=n/2;
        spc=1;
        for(int rows=1; rows<=n/2; rows++){
            for(int i=1; i<=str; i++){
                System.out.print(" *");
            }

            for(int i=1; i<=spc; i++){
                System.out.print("  ");
            }

            for(int i=1; i<=str; i++){
                System.out.print(" *");
            }

            str--;
            spc=spc+2;


            System.out.println();
        }

    }






    }
}
