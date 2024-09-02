import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
class max3 {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int p=sc.nextInt();
    int[] na=new int[(int) Math.log10(n)+1];
    int s=0;
    int i=0;
    while(n!=0){
        int r=n%10;
        na[i]=r;
        n=n/10;
        i++;
    }
    Arrays.sort(na);
    int l=na.length;
    int a=na[l-1]+na[l-2];
    for(int j=0;j<l;na[j]=na[j]+a,j++);
    System.out.println(Arrays.toString(na));
}    
}
