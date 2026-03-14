import java.util.*;

public class ContainerWithMostWater {

    public static int maxArea(int[] height){

        int left = 0;
        int right = height.length - 1;

        int maxarea = 0;

        while (left < right) {

            // height of container is the smaller vertical line
            int h = Math.min(height[left], height[right]);

            // width between the two lines
            int width = right - left;

            // calculate water area
            int area = h * width;

            // update maximum area found so far
            maxarea = Math.max(maxarea, area);

            // move pointer with smaller height
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }

        return maxarea;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of vertical lines :");
        int n = sc.nextInt();

        int[] height = new int[n];

        System.out.println("Enter the heights in Container :");
        for(int i = 0; i < n; i++){
            height[i] = sc.nextInt();
        }

        System.out.println("Max amount of Water Container can store : " + maxArea(height));
    }
}
/*
TERMINAL :
Enter no. of vertical lines :
8
Enter the heights in Container :
2
3
7
8
3
5
7
8
Max amount of Water Container can store : 35 
*/