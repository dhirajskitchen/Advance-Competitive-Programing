import java.util.*;

class Simple_Sieve{

    static public void main(String arg[]){
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        boolean[] flag=new boolean[n+1];
        for(int i=2;i<=n;i++){
            flag[i]=true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(flag[i]==true){
                for(int j=i*i;j<=n;j=j+i){
                    flag[j]=false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(flag[i]==true){
                System.out.printf("%d ",i);
            }
        }
        inp.close();
    }
}