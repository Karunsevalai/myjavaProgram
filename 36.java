import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
class max211 {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] na=new int[(int) Math.log10(n)+1];
    int i=0;
    while(n!=0){
        int r=n%10;
        na[i]=r;
        n=n/10;
        i++;
    }
  Arrays.sort(na);
  int l=na.length;
  for(int k=l-1;k>=0;System.out.print(na[k]),k--);
}    
}
