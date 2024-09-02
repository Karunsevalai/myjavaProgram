import java.util.Scanner;

class Heai {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),r=0,pw=1;
        // System.out.println((int)Math.log10(n)+1);
        for(;n/pw!=0;pw*=10,r++);
        System.out.println(r+" "+n+" "+pw  );               
    }
}