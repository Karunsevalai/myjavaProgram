import java.util.*;
class ki {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    char[] ch = s.toCharArray();
    
    for(int i=0;i<ch.length;i++){
        if(ch[i]%2==0){
            ch[i]=(char) (((ch[i]+30)*2)+5);
        }
        else{
            ch[i]=(char) ((((ch[i]*2)+2)*5)+5);
        }
    }
    System.out.println(ch);
}    
}
// a-z A-z +30*2+5 odd..................................................................................
//         *2+2*5+5 even
