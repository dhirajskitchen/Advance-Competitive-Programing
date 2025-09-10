import java.util.*;
class Binary_Palindrome{
    public static boolean Palindrome(int n){
        String s=Integer.toBinaryString(n);
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }

    static public void main(String args[]){
        Scanner inp=new Scanner(System.in);
        if(Palindrome(inp.nextInt())){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        inp.close();
    } 
}