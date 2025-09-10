import java.util.*;

public class Euclids_Algorithm {
    static public int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    static public void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int n1 = inp.nextInt(), n2 = inp.nextInt();
        System.err.println(gcd(n1, n2));
        inp.close();
    }
}
