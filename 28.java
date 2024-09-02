
import java.util.*;
class frog{
   public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int f=sc.nextInt(),in=sc.nextInt();
       int[] x1=new int[f];
       int[] y1=new int[f];
       int[] t=new int[f];
       int[] c=new int[f];
       int[] x2=new int[in];
       int[] y2=new int[in];
       for(int i=0;i<f;x1[i]=sc.nextInt(),y1[i]=sc.nextInt(),t[i]=sc.nextInt(),i++);
       for(int i=0;i<in;x2[i]=sc.nextInt(),y2[i]=sc.nextInt(),i++);
       for(int i=0;i<f;i++){
           for(int j=0;j<in;j++){
               int dis=(int)Math.sqrt(Math.pow((x1[i]-x2[j]),2)+Math.pow((y1[i]-y2[j]),2));
               if(dis<t[i]){
                   c[i]++;
               }
           }
       }
       for(int i=0;i<f;System.out.print(c[i]+" "),i++);
   }
}