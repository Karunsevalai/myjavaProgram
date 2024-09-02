class hcf {
public static void main(String args[]){
    int a=72,b=120,c=a>b?a:b;
    int g=0;
    for(int i=1;i<c;i++){
        if(a%i==0 && b%i==0){
            g=i;
        }
    }
    System.out.println(g+" "+(a*b)/g);
}    
}
