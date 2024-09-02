import java.util.Scanner;
class max {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int s=0;
    while(n!=0){
        int r=n%10;
        s=r>s?r:s;
        n=n/10;
    }
    System.out.println(s);
}    
}
