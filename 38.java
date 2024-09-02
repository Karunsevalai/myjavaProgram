import java.util.Scanner;
class cop8pp {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int rev=0;
    int t=n;
    while(true){
        if(t==rev && t>9){
            System.out.println(rev);
            break;
        }
        n=rev+t;
        rev=0;
        t=n;
        while(n!=0){
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
   //System.out.println(rev);

       
    }
}    
}
