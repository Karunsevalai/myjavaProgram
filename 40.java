import java.util.Scanner;
class cop13211 {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] ar=new int[n];
    int j=0;
    for(int i=0;i<n;i++){
        ar[i]=sc.nextInt();
        if(ar[i]>ar[i+1]){
          j++;
        }
    }
    System.out.println(j);
}    
}
