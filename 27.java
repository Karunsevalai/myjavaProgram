
import java.util.*;
class Main1{
   public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int x=sc.nextInt(),y=sc.nextInt();
       int r=sc.nextInt(),x1=sc.nextInt(),y1=sc.nextInt();
       int dis=(int)Math.sqrt(Math.pow((x1-x),2)+Math.pow((y1-y),2));
       if(dis==r){
           System.out.println("on the circle");
       }else if(dis<r){
           System.out.println("inside the circle");
       }else {
           System.out.println("over the circle");
       }
   }
}