import java.util.Scanner;
class cop1 {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a=10;
    int b=3;
    a=a^b;
    b=a^b;
    a=a^b;
    System.out.println(a+" "+b);
}    
}
