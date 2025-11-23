import java.util.*;

public class sortedPermutation {
    static public void backtrack(char[] chars, boolean[] used, StringBuilder curr, HashSet<String> res) {
        if (curr.length() == chars.length) {
            res.add(new String(curr));
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            if (used[i])
                continue;

            used[i] = true;
            curr.append(chars[i]);

            backtrack(chars, used, curr, res);

            used[i] = false;
            curr.deleteCharAt(curr.length() - 1);
        }
    }

    static public void main(String args[]) {
        String s = "RSST";
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        boolean[] used = new boolean[arr.length];
        HashSet<String> res = new HashSet<>();
        backtrack(arr, used, new StringBuilder(), res);
        System.out.print(res);
    }
}
