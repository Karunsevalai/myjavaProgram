//spiral pattern
import java.util.Scanner;
class Square {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int u=0,d=n-1,l=0,v=n+d;
    int b[][]=new int[n][v];
    for(int i=n;i>=1;i--,u++,l++){
    int a[]=new int[v];    
        for(int j=0;j<=v-1;j++){
            a[j]=i;
        }
        int f=n+d-1;
        for(int k=0,t=u;k<u;a[k]=a[k]+t,a[f]=a[f]+t,k++,t--,f--);
        b[l]=a;
        for(int m:a){
            System.out.print(m+" ");
        }
        System.out.println();
    }
     for(int f=n-2;f>=0;f--){
        int m[]=b[f];
        for(int a:m){
            System.out.print(a+" ");
        }
        System.out.println();
    }
}    
}
