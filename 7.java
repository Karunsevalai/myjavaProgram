import java.util.Scanner;

class Hei {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i;
        for(i=2;n%i!=0;i++);
        System.out.println((i>=n)?"Prime":"Not Prime");
    }
}