public class Maximum_Product_Subarray {
    static public int MPS(int nums[]) {
        // int n = nums.length;
        int maxProd = nums[0], currProd = nums[0];
        for (int i : nums) {
            currProd = Math.max(currProd * i, i);
            if (currProd > maxProd)
                maxProd = currProd;
        }
        return maxProd;
    }

    public static void main(String[] args) {
        // int arr[] = { 0, 1, 2, 3 };
        int arr2[] = { 2, -2, 3, 4 };
        System.out.println(MPS(arr2));
    }
}
