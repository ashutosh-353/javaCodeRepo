public class Remove_duplicates_of_aString {
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);

            return;
        }

        char currentChar = str.charAt(idx);

        if (map[currentChar - 'a'] == true) {
            removeDuplicates(str, idx + 1, newStr, map);
        }

        else {
            map[currentChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currentChar), map);
        }
    }

    public static void main(String args[]) {
        String str = "okaygoogle";
        int idx = 0;
        StringBuilder newStr = new StringBuilder();
        boolean map[] = new boolean[26];

        removeDuplicates(str, idx, newStr, map);
    }
}
