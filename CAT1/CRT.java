public class CRT {
    static public int CRT_func(int a[], int m[], int n, int p) {
        int x = 0;
        for (int i = 0; i < n; i++) {
            int M = p / m[i];
            int y = 0;
            for (int j = 0; j < m[i]; j++) {
                if ((M * j) % m[i] == 1) {
                    y = j;
                    break;
                }
            }
            x = x + a[i] * M * y;
        }
        return x % p;
    }

    public static void main(String[] args) {
        int a[] = { 2, 3, 2 };
        int m[] = { 3, 5, 7 };
        int p = 1;
        for (int i = 0; i < a.length; i++) {
            p *= m[i];
        }
        System.out.println(CRT_func(a, m, 3, p));
    }
}