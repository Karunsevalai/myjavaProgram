import java.util.Scanner;
public class Queue {
    int size=10;
    int[] a=new int[size];
    int l=0;
    public void enqueue(int n){
        if(l>10){
            System.out.println("Queue is full");
        }
        a[l]=n;
        l++;
    }
    public void dequeue(){
        if(l<0){
            System.out.println("Queue is empty");
        }
        for(int i=0;i<l-1;i++){
         a[i]=a[i+1];
        }
        l--;
    }
    public void display(){
        for(int i=0;i<l;i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         Queue q=new Queue();
         System.out.println("Queue Implementation using stack");
        loop: while(true){
            System.out.println("Enter Your Choice:");
            System.out.println("1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            int c=sc.nextInt();
            switch (c) {
                case 1:
                System.out.println("Enter a Number:");
                int n=sc.nextInt();
                q.enqueue(n);
                    break;
                case 2:
                q.dequeue();
                    break;
                case 3:
                q.display();
                    break;
                case 4:
                    break loop;
                default:
                System.out.println("Invalid  Choice");
                    break;
            }
         }
    }
    
}
