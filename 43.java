import java.util.Scanner;
class copoi0 {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int t=n,r=0;
    while(n!=0){
        int re=n%10;
        r=r*10+re;
        n=n/10;
    }
    int s=0;
    while(r!=0){
        int re=r%100;
       // int k=((re%10)*10+(re/10));
        s=s*100+re;
        r=r/100;
    }
    System.out.println(s);
}    
}
