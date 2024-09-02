import java.util.Arrays;
import java.util.Scanner;
class lift {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int q=sc.nextInt();
    int[][] a=new int[q][2];
    for(int i=0;i<q;i++){
         a[i][0]=sc.nextInt();
         a[i][1]=sc.nextInt();
    }
    int s=0;
    for(int i=0;i<q;i++){
        s+=Math.abs(a[i][0]-a[i][1]);
        s+=Math.abs(a[i][1]-((i<q)?0:a[i][0]));
    }
    System.out.println(s);
}    
}
