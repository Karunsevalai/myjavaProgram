import java.util.Scanner;

class Hel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        int p=sc.nextInt();

        int c=0;
        for(int i=1;i<=n;i*=2){
            // System.out.println(i);
            c=i;
        }
        int k=n-c;
        int g=(2*k)+p;
        System.out.println(g>n?g-n:g);
    }
}