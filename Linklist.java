
import java.io.*;
import java.util.Scanner; 
   class Linklist { 
   
    static Node head; 
   
    static class Node { 
   
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 

    static void add(int a){
        if(head==null){
            head=new Node(a);
        }
        else{
           Node t=head;
            while(head.next!=null){
               head=head.next;
            }
            head.next=new Node(a);
            head=t;
        }
    }
    static void addk(int a,int k){
        if(head==null){
            System.out.println("Empty list");
        }
        else if(head.data==k){
            Node m=new Node(a);
            Node t=head;
            m.next=t;
            head=m;
        }
        else{
            Node t=head;
            Node p=head;
            while(head.next!=null){  
                if(head.data==a){                    
                    break;
                }
                p=head;
                head=head.next;                        
            }
            Node m2=new Node(a);
            p.next=m2.next; 
            m2.next=head;          
            head=t;
        }
    }
  static void display(){
    if(head==null){
        System.out.println("Empty list");
    }
    else{
        Node t=head;
        while(head.next!=null){
           System.out.print(head.data+" ");
           head=head.next;
        }
        System.out.println(head.data+" ");
        head=t;
    }
  }
    static void remove(int a){
        if(head==null){
            System.out.println("Empty list");
        }
        else if(head.data==a){
            Node t=head.next;
            head.next=null;
            head=t;
        }
        else{
            Node t=head;
            Node p=head;
            while(head.next!=null){  
                if(head.data==a){                    
                    break;
                }
                p=head;
                head=head.next;                        
            }
            p.next=head.next;           
            head=t;
        }
    }
    
    public static void main(String[] args){
        Linklist l=new Linklist();
        Scanner sc=new Scanner(System.in);
         System.out.println("Link  list");
        loop: while(true){
            System.out.println("Enter Your Choice:");
            System.out.println("1.add");
            System.out.println("2.remove");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            int c=sc.nextInt();
            switch (c) {
                case 1:
                System.out.println("Enter a Number:");
                int n=sc.nextInt();

                l.add(n);
                    break;
                case 2:
                System.out.println("Enter a Number:");
                int n1=sc.nextInt();
                l.remove(n1);
                    break;
                case 3:
                l.display();
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
// public class Linklist {
    
// }
