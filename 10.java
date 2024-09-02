import java.util.Scanner;

class Heaii {
    public static int revers(int n){
        int number = n, reverse = 0;  
        while(number != 0)   
        {  
        int remainder = number % 10;  
        reverse = reverse * 10 + remainder;  
        number = number/10;  
         }  
         return reverse;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),r=0,m,mr,s;
        r=revers(n);
        s=r*r;
        m=n*n;
        mr=revers(m);
        System.out.println((m + " "+mr));               

        System.out.println((s==mr));               
    }
}