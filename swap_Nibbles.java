import java.io.*;
import java.util.*;

public class swap_Nibbles {

    public static int swapNibbles(int n) {
        return ((n & 0x0F) << 4) | ((n & 0xF0) >> 4);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        System.out.println(swapNibbles(n));
    }
}
