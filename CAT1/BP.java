import java.util.*;

public class BP {
    public static boolean BP_func(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        System.err.println(BP_func(inp.nextLine()));
        inp.close();
    }
}
