import java.util.Scanner;
class Apple {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int c=4;
    for(int i=1;i<n;c=c*2+2,i++);
    System.out.println(c);
}    
}
