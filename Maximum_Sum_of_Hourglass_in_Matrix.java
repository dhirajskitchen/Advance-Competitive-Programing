public class Maximum_Sum_of_Hourglass_in_Matrix {
    public int MSOHIM(int[][] arr) {
        int r = arr.length, c = arr[0].length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < r - 2; i++) {
            for (int j = 0; j < c - 2; j++) {
                int curr = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
                        + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                max = Math.max(curr, max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Maximum_Sum_of_Hourglass_in_Matrix obj = new Maximum_Sum_of_Hourglass_in_Matrix();

        // Sample Input 0
        int[][] matrix1 = {
                { 1, 1, 1, 0, 0 },
                { 0, 1, 0, 0, 0 },
                { 1, 1, 1, 0, 0 },
                { 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0 }
        };
        System.out.println("Sample Output 0: " + obj.MSOHIM(matrix1)); // Expected: 7

        // Sample Input 1
        int[][] matrix2 = {
                { 0, 3, 0, 0, 0 },
                { 0, 1, 0, 0, 0 },
                { 1, 1, 1, 0, 0 },
                { 0, 0, 2, 4, 4 },
                { 0, 0, 0, 2, 4 }
        };
        System.out.println("Sample Output 1: " + obj.MSOHIM(matrix2)); // Expected: 11
    }
}
