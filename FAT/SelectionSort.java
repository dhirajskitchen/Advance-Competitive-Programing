public class SelectionSort {
    public static int[] SS(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
        return nums;
    }

    static public void main(String args[]) {
        int nums[] = { 5, 9, 7, 2, 4, 6, 9 };
        nums = SS(nums);
        for (int n : nums)
            System.out.print(n + " ");
    }
}
