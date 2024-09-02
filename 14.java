import java.util.*;
class Coke{
    public static void main(String[] args) {
        // Scanner cs=new Scanner(System.in);
        int n=0;
        int[] trmp={1,2,8};
        int[] price={6,8,10};
        int L=4,R=6;
        int M=2,K=5;
        while(M>0){
        for(int i=0;i<3;i++){
            if(trmp[i]>K){
                trmp[i]-=1;
            }else if(trmp[i]<K){
                trmp[i]+=1;
            }
        }
            M--;
        }
        int pn=1000000;
        for(int i=0;i<3;i++){
            if(trmp[i]>=L && trmp[i]<=R){
                if(price[i]<pn){
                    pn=price[i];
                    n=i;
                }
            }
        }
        System.out.print("The coke "+(n+1)+" cost "+price[n]+" is the cheapest coke");
    }
}