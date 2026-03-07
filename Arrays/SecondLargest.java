import java.util.*;
public class SecondLargest {
    public static int SecondLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for(int num : arr){
            if(num > largest){
                secondLargest = largest;
                largest = num;
            }
            else if(num > secondLargest && num !=largest){
                secondLargest=num;
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of elements in array :");
        int n=sc.nextInt();
        
        int[] arr=new int[n];
        System.out.println("Enter elements in array :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The second largest element in array :"+SecondLargest(arr));
        
    }
    
}
