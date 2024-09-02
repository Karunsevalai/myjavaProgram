//import java.util.Scanner;
class rot {
public static void main(String args[]){
    //Scanner sc=new Scanner(System.in);
    String a="apple";
    String b="leapp";
    //String ans = str.substring(d) + str.substring(0, d)
    for(int i=4;i>0;i--){
        String g=a.substring(i)+a.substring(0,i);
        if(b.equals(g)){
       System.out.println("yes"+g);        
        }
        else{
       System.out.println("no "+g);        

        }
    }
}    
}
