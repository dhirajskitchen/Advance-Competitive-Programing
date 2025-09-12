public class longest_sequence_of_1 {

    public static int longestOnes(int[] nums) {
        int maxLen = 0, currLen = 0;
        int l = 0, r = 0, z = 0;
        while (r < nums.length) {
            if (nums[r] == 0)
                z++;
            while (z > 1) {
                if (nums[l] == 0)
                    z--;
                l++;
            }
            currLen = r - l + 1;
            maxLen = Math.max(maxLen, currLen);
            r++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 0, 1, 1, 0 };
        int[] nums2 = { 1, 1, 1, 1 };
        int[] nums3 = { 0, 0, 0, 1 };

        System.out.println("Longest 1s after flip in nums1: " + longestOnes(nums1)); // Output: 4
        System.out.println("Longest 1s after flip in nums2: " + longestOnes(nums2)); // Output: 4
        System.out.println("Longest 1s after flip in nums3: " + longestOnes(nums3)); // Output: 2
    }
}
