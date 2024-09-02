import java.util.Arrays;
import java.util.Scanner;
class cop123 {
    public static String reverse(String s) {
        char[] ch = s.toCharArray();
        int l=ch.length;
        for(int i=0,t=l-1;i<l/2;i++,t--){
            char c=ch[i];
          ch[i]=ch[t];
          ch[t]=c;
          ch[i]=ch[i]%2!=0?(ch[i]=(char) (ch[i]-1)):(ch[i]=(char) (ch[i]+12));
          ch[t]=ch[t]%2==0?(ch[t]=(char) (ch[t]-1)):(ch[t]=(char) (ch[t]+12));
        }
        if(l%2!=0){
            int w=(int) Math.ceil(l/2);
            ch[w]=ch[w]%2==0?(ch[w]=(char) (ch[w]-1)):(ch[w]=(char) (ch[w]+12));
        }
        String c=new String(ch);
        return c;
    }
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String[] s=sc.nextLine().split(" ");
    for(int i=0;i<s.length;i++){
      s[i]=reverse(s[i]);
    }
    String s1 = String.join(" ", s);
    System.out.println(s1);
}    
}
