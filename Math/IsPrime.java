import java.util.*;
public class IsPrime {
    public static boolean isPrime(int n){
        if(n < 1) return false;
        for(int i=2;i<Math.sqrt(n);i++){
            if(n % i == 0){
                return false; 
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int n = sc.nextInt();
        boolean result = isPrime(n);
        if(result == true){
            System.out.println("It is prime");
        }
        else{
            System.out.println("It is not prime");
        }

    }
}