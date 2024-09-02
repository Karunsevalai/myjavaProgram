import java.util.Scanner;
class Hello {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        switch(n){
            case 1:
            for(char ch='A';ch<'Z';System.out.print(ch++));
            break;
            case 2:
            for(char ch='a';ch<'Z';System.out.print(ch++));
            break;
            case 3:
            for(char ch='A';ch<'Z';System.out.print(ch+""+(char)(ch+32)),ch++);
            break;
            case 4:
            for(char ch='A';ch<'Z';System.out.print((char)(ch+32)+""+ch),ch++);
            break;
            case 5:
            for(char ch='A';ch <'Z';System.out.print(ch+""+(char)(ch+33)),ch+=2);
            break;
            case 6:
            for(char ch='A';ch <'Z';System.out.print((char)(ch+32)+""+(char)(ch+1)),ch+=2);
            break;


        }
    }
}
