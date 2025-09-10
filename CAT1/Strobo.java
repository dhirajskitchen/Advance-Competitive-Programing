import java.util.*;

public class Strobo {
    static public boolean strobo(int n) {
        String s = Integer.toString(n);
        Map<Character, Character> StroboDic = new HashMap<>();
        StroboDic.put('1', '1');
        StroboDic.put('0', '0');
        StroboDic.put('8', '8');
        StroboDic.put('6', '9');
        StroboDic.put('9', '6');

        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (StroboDic.getOrDefault(s.charAt(l), '-') != s.charAt(r)
                    || StroboDic.getOrDefault(s.charAt(r), '-') != s.charAt(l)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.err.println(strobo(96));
    }
}
