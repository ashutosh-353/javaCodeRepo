public class Tiling_problem_recursion {

    public static int tilingProblem(int n) {
        // Base Case
        if(n==0 || n==1){
            return 1;
        }

        // Choice 1--Vertical
        int fnm1 = tilingProblem(n - 1);

        // Choice 2--Horizontal
        int fnm2 = tilingProblem(n - 2);

        //Calculation of total number of ways
        int totalWays = fnm1 + fnm2;

        return totalWays;

    }

    public static void main(String args[]) {
        System.out.println(tilingProblem(5));
    }
}    
