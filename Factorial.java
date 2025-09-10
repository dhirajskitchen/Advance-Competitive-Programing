import java.util.*;

class Factorial{
    static public int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    static public void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.println(fact(inp.nextInt()));
        inp.close();
    }
}