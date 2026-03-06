public class GCD {
    public static int GCD(int a,int b){
        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }
            else{
                b=b%a;
            }

        }
        if(a==0){
            return b;
        }
        return a;

    }
    public static void main(String[] args){
        int a=10;
        int b=15;
        System.out.println("Input : n1="+a+",n2="+b);
        System.out.println("Gcd of "+a+","+b+" is "+GCD(a, b));
    }
    
}
