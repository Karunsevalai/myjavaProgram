class HelloWorl {
    public static int fact(int num){
        int fact=1;
        for(int itr=1;itr<=num;fact *= itr,itr++);
        return fact;
    }
    public static void main(String[] args) {
        int c;
        for(int i=0,n=1;i<21;System.out.print(i+" "),c=i+n,i=n,n=c);
        System.out.println(" ");     
         
        int row,col,num=1,d=1;
        for(row=1;d<=20;row++,num--)
           for(col=1;col<=row;System.out.print(num+" "),col++,num+=2,d++);
        System.out.println(" ");
        for(int i=0;i<=10;i++){
            int cat=fact(2*i)/(fact(i+1)*fact(i));
            System.out.print(cat+" ");
        }
      
    }
}
