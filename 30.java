import java.util.Scanner;
class latindrome {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    char[] c=s.toCharArray();
    int n=c.length/2;
    char[] a=new char[n];
    char[] b=new char[n];
    System.out.println(s);
}    
}
