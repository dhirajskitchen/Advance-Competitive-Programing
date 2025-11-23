public class moveHyphen {
    static public String MH(String s) {
        char arr[] = s.toCharArray();
        int i = arr.length - 1;
        for (int j = i - 1; j >= 0; j--) {
            if (arr[j] != '-') {
                char c = arr[i];
                arr[i] = arr[j];
                arr[j] = c;
                i--;
            }
        }
        String ans = new String(arr);
        return ans;
    }

    static public void main(String args[]) {
        String s = "hello-world-";
        System.out.println(MH(s));
    }
}
