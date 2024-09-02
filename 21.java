import java.util.*;
class encrypt {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    char[] ch = s.toCharArray();
    int l=ch.length;
    for(int i=0,t=l-1;i<l/2;i++,t--){
        char c=ch[i];
      ch[i]=ch[t];
      ch[t]=c;
      ch[i]=ch[i]%2==0?(ch[i]=(char) (ch[i]-1)):(ch[i]=(char) (ch[i]+12));
      ch[t]=ch[t]%2==0?(ch[t]=(char) (ch[t]-1)):(ch[t]=(char) (ch[t]+12));
    }
    if(l%2!=0){
        int w=(int) Math.ceil(l/2);
        ch[w]=ch[w]%2==0?(ch[w]=(char) (ch[w]-1)):(ch[w]=(char) (ch[w]+12));
    }
    
    System.out.println(ch);

}    
}
// a-z A-z +30*2+5 odd     hello  
//         *2+2*5+5 even
/*
 * reverse
 * odd +12
even -1

O(logn)
 * 
 * 
 */