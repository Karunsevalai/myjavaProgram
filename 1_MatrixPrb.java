import java.util.Scanner;
class Matrix{
    public static void main(String[] args) {
        //System.out.println("hi");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Matrix size:");
        int n=sc.nextInt();     //get matrix size
        int[][] M1=new int[n][n];  //Declare M1 and M2
        int[][] M2=new int[n][n];

        for(int i=0;i<n;i++){   //get input for M1 and M2
             for(int j=0;j<n;j++){
                System.out.print("M1 of "+i+" "+j+" :");
                M1[i][j]=sc.nextInt();
                System.out.print("M2 of "+i+" "+j+" :");
                M2[i][j]=sc.nextInt();
             }
        }

        System.out.println("Addition Matrix:");// Addition matrix
        for(int i=0;i<n;i++){  
            for(int j=0;j<n;j++){
               System.out.print(M1[i][j]+M2[i][j]+" ");
            }
            System.out.println();
       }
    
       
       System.out.println("Multiplication Matrix:");// Multiplication matrix
       for(int i=0;i<n;i++){  
        for(int j=0;j<n;j++){
        //i=0 => j=0=>k=0,1, j=1=>k=0,1 
        int s=0;
           for(int k=0;k<n;k++){
            //int   //00 10  01 11
            int c=M1[i][k]*M2[k][j];
            s+=c;
           }
        System.out.print(s +" ");
        }
        System.out.println();
   
    }
}
}