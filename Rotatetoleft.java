
public class Rotatetoleft {
    public static void rev(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

    public static void RL_func(int[] nums, int k) {
        int n = nums.length;
        if (n == 0)
            return;
        k = k % n;
        rev(nums, 0, n - 1);
        rev(nums, 0, n - k - 1);
        rev(nums, n - k, n - 1);
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        RL_func(arr, 2);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }

    }
}
