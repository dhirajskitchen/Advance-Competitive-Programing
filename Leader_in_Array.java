import java.util.*;
public class Leader_in_Array {
    public static List<Integer> LIA(int[] arr) {
        List<Integer> res=new ArrayList<>();
        int lead = arr[arr.length - 1];
        res.add(lead);
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > lead) {
                lead = arr[i];
                res.add(lead);
            }
        }

        return res;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 6, 3, 1, 2 };
        for (int num : LIA(arr)) {
            System.out.printf("%d ",num);
        }
    }
}
