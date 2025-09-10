class Chinese_remainder_theorem {
    static public int CRT(int a[], int m[], int n, int p) {
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
            // System.err.println(M);
            // System.err.println(x);
        }
        return x % p;
    }

    public static void main(String args[]) {
        int a[] = { 2, 3, 2 };
        int m[] = { 3, 5, 7 };
        int n = a.length;
        int p = 1;
        for (int i = 0; i < n; i++) {
            p *= m[i];
        }

        int res = CRT(a, m, n, p);
        System.out.println(res);
    }
}
