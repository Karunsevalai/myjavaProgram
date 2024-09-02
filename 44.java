import java.util.Scanner;
class butterfly {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int l=n;
    for(int i=0;i<n;i++){

        for(int j=0;j<=i;j++){
        System.out.print("*");
        }
        for(int k=0;k<2*(l-1);k++){
      System.out.print(" "); 
        }
      l--;
        
        for(int j=0;j<=i;j++){
            System.out.print("*");
            }
    System.out.println();
    }
    int g=0;
    for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
        System.out.print("*");
        }
        for(int j=0;j<g;j++){
          System.out.print(" ");
          }
          g+=2;
        for(int j=i;j<n;j++){
          System.out.print("*");
          }
    System.out.println();
    }
}    
}
