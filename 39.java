import java.util.Scanner;
class aappl{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int m=Math.min(a, b);
    for(int i=1;i<=m;i++){
        a=a-i;
        b=b-(i+1);
        if(a<1){
            System.out.print("b");
            break;
        }
        if(b<1){
            System.out.print("a");
            break;
        }
        
    }

    System.out.println();
}    
}
