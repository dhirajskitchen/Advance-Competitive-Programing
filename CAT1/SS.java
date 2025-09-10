import java.util.*;

public class SS {
    static public void SS_func(int n) {
        boolean primes[] = new boolean[n + 1];
        for (int i = 2; i < n + 1; i++) {
            primes[i] = true;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (primes[i] == true) {
                for (int j = i * i; j < n + 1; j = j + i) {
                    primes[j] = false;
                }
            }
        }

        for (int i = 2; i < n + 1; i++) {
            if (primes[i])
                System.err.println(i);
        }

    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        SS_func(inp.nextInt());
        inp.close();
    }
}
