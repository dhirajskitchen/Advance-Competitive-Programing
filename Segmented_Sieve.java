import java.util.*;

class Segmented_Sieve {
    static public void main(String args[]) {
        int low, high;
        Scanner inp = new Scanner(System.in);
        low = inp.nextInt();
        high = inp.nextInt();
        // int primes1[]=new int[Math.sqrt(high)+1];
        boolean flag1[] = new boolean[(int) Math.sqrt(high) + 1];

        for (int i = 2; i < (int) Math.sqrt(high) + 1; i++) {
            flag1[i] = true;
        }

        for (int i = 2; i < (int) Math.sqrt(high) + 1; i++) {
            if (flag1[i] == true) {
                for (int j = i * i; j < (int) Math.sqrt(high) + 1; j += i) {
                    flag1[j] = false;
                }
            }
        }

        boolean flag2[] = new boolean[high - low + 1];
        for (int i = 0; i < high - low + 1; i++) {
            flag2[i] = true;
        }

        for (int i = 2; i < (int) Math.sqrt(high) + 1; i++) {
            if (flag1[i] == false)
                continue;
            int start = (low / i) * i;
            // System.out.printf("%d ",start);
            if (start < low)
                start = start + i;
            if (i * i > start) {
                start = i * i;
            }
            // System.out.println(start);
            for (int j = start - low; j < high - low + 1; j = j + i) {
                flag2[j] = false;
            }
        }
        for (int i = 0; i < high - low + 1; i++) {
            if (flag2[i] == true) {
                System.out.printf("%d ", i + low);
            }
        }
        inp.close();
    }
}