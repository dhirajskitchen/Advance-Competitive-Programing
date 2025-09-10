import java.util.*;

public class SS2 {
    public static void SS2_func(int low, int high) {
        int sqr = (int) Math.sqrt(high) + 1;
        boolean flag1[] = new boolean[sqr];
        for (int i = 0; i < sqr; i++) {
            flag1[i] = true;
        }
        for (int i = 2; i < Math.sqrt(sqr); i++) {
            if (flag1[i] == true) {
                for (int j = i * i; j < sqr; j = j + i) {
                    flag1[j] = false;
                }
            }
        }
        boolean flag2[] = new boolean[high - low + 1];
        for (int i = 0; i < high - low + 1; i++) {
            flag2[i] = true;
        }
        for (int i = 2; i < sqr; i++) {
            if (flag1[i] == true) {
                int start = (low / i) * i;
                while (start < low)
                    start += i;
                if (start < i * i)
                    start = i * i;
                for (int j = start; j < high + 1; j = j + i) {
                    flag2[j - low] = false;
                }
            }
        }
        for (int i = 0; i < high - low + 1; i++) {
            if (flag2[i]) {
                System.err.println(i + low);
            }
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        SS2_func(inp.nextInt(), inp.nextInt());
        inp.close();
    }
}
