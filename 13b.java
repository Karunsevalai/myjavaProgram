import java.util.*;
class Spiral {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        int n=cs.nextInt();
        int st=-(n-1),en=n-1;
        for(int r=st;r<=en;r++,System.out.println())
            for(int c=st;c<=en;c++)
            System.out.print(Math.abs(Math.max(Math.abs(r)-n,Math.abs(c)-n))+" ");
            
        
    }
}