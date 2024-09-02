import java.util.Scanner;
class cop131 {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String s=sc.nextLine();
    int num=(int) Math.log10(n)+1;
    int[] arr=new int[num];
    for(;num>0;arr[--num]=n%10,num/=10);
    char[] c=s.toCharArray();

    System.out.println(num);
}    
}
