import java.util.*;

public class fact {
    static public int c_fact(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * c_fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.err.println(c_fact(inp.nextInt()));
        inp.close();
    }
}
