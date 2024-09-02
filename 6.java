import java.util.Scanner;

class Hi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;System.out.print(n%i==0?i+" ":""),i++);

    }
}