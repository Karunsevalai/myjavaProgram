import java.util.Scanner;
class crystalPrime {
    public static int prime(int t){
        int c=0;
        for(int i=1;i<=t;i++){
            if(t%i==0){
                c++;
            }
        }
        return c;
    }
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int p=sc.nextInt();
    int k=1,m=0;
    while(true){
        int t=k;
        int c=prime(t);
        // int m=0;
        if(c==2){
            int l=t,r=0;
            while(l!=0){
                int re=l%10;
                r=(r*10)+re;
                l=l/10;
            }
            int y=prime(r);
            if(y==2){
                m=m+1;
            }
        }
        if(p==m){
        System.out.println(t);
            break;
        }
        k++;
    }

}    
}
