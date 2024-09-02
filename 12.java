//sandwich pattern


import java.util.Scanner;

class Li {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int i=1;
        String []a=new String[l];
        // int c[]={0,4,1,3,2};
        int n=0,m=l-1;
        int c[]=new int[l];
        for(int k=0;k<l;k++){
            if(k%2==0){
                c[k]=n;
                n++;
            }
            else{
               c[k]=m;
               m--;
            }
        }
        for (int row = 1; row <= l; row++) {
            String s="";
            for (int col = 1; col <= l; col++,i++) {
                s+=(i<10)?"0"+i+" ":i+" ";            
            }
            a[c[row-1]]=s;
        }
        for(String s:a){
            System.out.println(s);
        }
       
    }
}
                // if (row % 2 != 0) {
                //     System.out.printf("%d ", i);
                // } else {
                //     System.out.printf("%d ", i);
                // }
                // System.out.printf((i<10)?"0%d ":"%d ", i);
            // System.out.print(s);

            // int b[]=new int[5];
            // int t=5; 
            // for(int k=0;k<5;k++){
               
            // }