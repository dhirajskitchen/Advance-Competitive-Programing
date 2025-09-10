import java.util.*;

class AAT {
    public static int AAT_red(int m, int k, int n, int s, int w, int e) {

        if (m <= s * k + w + e) {
            return m;
        }
        return -1;
    }

    static public void main(String args[]) {
        Scanner inp = new Scanner(System.in);

        inp.close();

    }
}