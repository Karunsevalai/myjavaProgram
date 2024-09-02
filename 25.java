import java.util.Scanner;
class neon {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a=n*n;
    int i=a;
    int s=0;
    while(i!=0){
       s+=i%10;
       i=i/10;
    }
    System.out.println(s==n?"neon":"no");
}    
}
