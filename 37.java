import java.util.Scanner;
class coppp {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int s=0,t=0;
    int n=sc.nextInt();
    int f=sc.nextInt();

    for(int i=1;i<=n;i++){
        s+=(n%i==0?i:0);
    }
    for(int i=1;i<=f;i++){
        t+=(f%i==0?i:0);
    }
    System.out.println(n+" "+s);
    System.out.println(n==t && f==s);
}    
}
