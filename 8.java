import java.util.Scanner;

class Heei {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
     
        for(int n=0;n<h;n++){
            int c=0;
            for(int i=1;i<=n;c=n%i==0?c+1:c+0,i++);
          System.out.print((c==2?n+" ":""));
        }

    }
}