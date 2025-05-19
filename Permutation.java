public class Permutation {

    public static void permutation_func(String str, String ans) {
        // BaseCase
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);

            String newStr = str.substring(0, i) + str.substring(i + 1, str.length());

            permutation_func(newStr, ans + curr);
        }

    }

    public static void main(String args[]) {
        String str = "abc";
        String ans = "";
        permutation_func(str, ans);
    }
}
