import java.util.*;
public class ReverseSubMatrix {
    public static int[][] reverseSubMatrix(int[][] grid, int x,int y, int k){
        int i = x;
        int j = x + k - 1;
        while (i < j) {
            for(int m = y; m < y + k; m++){
                System.out.println("hello");
                int temp = grid[i][m];
                grid[i][m] = grid[j][m];
                grid[j][m] = temp;
            }
            i++;
            j--;
        } 
        return grid;
    }
    public static void main(String[] args) {
        int x = 1;
        int y = 0;
        int k = 3;
        int[][] grid = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
            };
        int[][] result =  reverseSubMatrix(grid, x, y, k);
        for(int[] list : result){
            System.out.println(Arrays.toString(list));
        }

    }
}
