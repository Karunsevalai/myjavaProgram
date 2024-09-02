import java.util.Arrays;
import java.util.Scanner;
class guwisg {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt(),p=0,m=0;
       int[] a=new int[n];
       for(int i=0;i<n;a[i]=sc.nextInt(),i++);
       int[] v=new int[n];
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               if(i==j){
                   continue;
               }else{
                   v[i]+=a[j];
               }
           }
       }
       for(int i=0;i<n;i++){
           if(v[i]>m){
               m=v[i];
               p=i;
           }
       }
       System.out.print(m+" "+(p+1));
   }}