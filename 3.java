import java.util.Scanner;

class HelloWor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,n2,n3,c;
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        c=sc.nextInt();
        if(c==1){
            for(int i=n1;i<n2;System.out.print(i+" "),i+=n3);
        }
        else{
            for(int i=n1;i<n2;System.out.print(i+" "),i*=n3);
        }

    }
}