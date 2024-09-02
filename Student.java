import java.util.Scanner;

public class Student {  // Student class used for datatype to store string,int,int
    private String Name;
    private int prg_j;
    private int prg_d;
    Student(String name,int pj,int pd){
       Name=name;
       prg_j=pj;
       prg_d=pd;
    }
    public String getName() {
        return Name;
    }
    public int getPrg_d() {
        return prg_d;
    }
    public int getPrg_j() {
        return prg_j;
    }

}

class Detail{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number of Students:");
    int n=sc.nextInt();
    Student[] b=new Student[61];
   // int c=0;
    for(int i=0;i<n;i++){
        String name=sc.next();
        int j=sc.nextInt();
        int d=sc.nextInt();
        b[i]=new Student(name,j,d);
    }
   System.out.println("Student Details");
   for(int i=0;i<n;i++){
    System.out.println(b[i].getName()+" "+b[i].getPrg_j()+" "+b[i].getPrg_d());
   }
  }
}