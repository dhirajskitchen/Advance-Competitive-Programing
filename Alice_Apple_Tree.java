/* 
M - Required red apple count
K - Apples per tree
N - No of trees in North
S - No of trees in South
W - No of trees in West
E - No of trees in East 
*/

import java.util.*;

class Alice_Apple_Tree{
    static public int AAT_red(int m,int k,int n,int s,int w,int e ){
        int m1=m;
        if(m1<=s*k){
            return m;
        }
        else{
            m1-=s*k;
        }
        if(m1<=w+e){
            return m;
        }
    
        return -1;
    }
    static public void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.println(AAT_red(inp.nextInt(),inp.nextInt(),inp.nextInt(),inp.nextInt(),inp.nextInt(),inp.nextInt()));
        inp.close();
    }
}

