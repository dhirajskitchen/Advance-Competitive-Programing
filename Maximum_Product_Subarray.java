public class Maximum_Product_Subarray {
    static public int MPS(int nums[]) {
        int maxProd=Integer.MIN_VALUE;
        int pre=1,suff=1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(pre==0) pre=1;
            if(suff==0) suff=1;
            pre*=nums[i];
            suff*=nums[n-1-i];
            maxProd=Math.max(maxProd,Math.max(pre,suff));
        }
        return maxProd;
    }

    public static void main(String[] args) {
        // int arr[] = { 0, 1, 2, 3 };
        int arr2[] = { 2, -2, 3, 4 };
        System.out.println(MPS(arr2));
    }
}
