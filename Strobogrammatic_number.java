import java.util.*;

class Strobogrammatic_number {
    static public boolean isStrobogrammatic(int num) {
        Map<Character, Character> StrobogrammaticDictionary = new HashMap<>();
        StrobogrammaticDictionary.put('0', '0');
        StrobogrammaticDictionary.put('1', '1');
        StrobogrammaticDictionary.put('8', '8');
        StrobogrammaticDictionary.put('9', '6');
        StrobogrammaticDictionary.put('6', '9');

        String num_str = Integer.toString(num);
        int l = 0, r = num_str.length() - 1;

        while (l < r) {
            if (!StrobogrammaticDictionary.containsKey(num_str.charAt(l))
                    || !StrobogrammaticDictionary.containsKey(num_str.charAt(r))) {
                return false;
            } else if (num_str.charAt(l) != StrobogrammaticDictionary.get(num_str.charAt(r))
                    || num_str.charAt(r) != StrobogrammaticDictionary.get(num_str.charAt(l))) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    static public void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        if (isStrobogrammatic(n)) {
            System.out.printf("%d is Strobogrammatic", n);
        } else {
            System.out.printf("%d is not Strobogrammatic", n);
        }
        inp.close();
    }
}