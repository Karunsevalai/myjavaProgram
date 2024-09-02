import java.util.Scanner;
class cop456 {
    public static int i,n;
    public static int[] ar;
    public static void rev(int i){
        if(i<n){
            rev(i+1);
            System.out.print(ar[i]+" ");
        }
    }
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    i=0;
    n=sc.nextInt();
    ar=new int[n];
    for(int j=0;j<n;j++){
        ar[j]=sc.nextInt();
    }
    // System.out.println();
    rev(i);
}    
}
