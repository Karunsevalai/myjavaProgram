import java.util.Scanner;

class Heaiii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []a={1,2,3,4,5,6,7};
        int l=a.length;
        for(int i=0,j=l-1;i<l/2;i++,j--){
            int t=a[j];
            a[j]=a[i];
            a[i]=t;
        }     
        for(int n:a){
            System.out.println(n);
            
        }     
    }
}