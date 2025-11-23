import java.util.*;

class Josephus {
    static public void main(String args[]) {
        int n = 7, k = 3;
        boolean killed[] = new boolean[n];
        int i = 0;
        int kcount = 0;
        while (kcount < n - 1) {
            if (!killed[i]) {
                killed[i] = true;
                kcount++;
                i = (i + k) % n;
            }
        }
        for (int j = 0; j < n; j++) {
            if (!killed[j])
                System.out.println(j);
        }
    }
}