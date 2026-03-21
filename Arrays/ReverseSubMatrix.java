import java.util.*;

public class ReverseSubMatrix {

    public static int[][] reverseSubMatrix(int[][] grid, int x, int y, int k){

        int i = x;
        int j = x + k - 1;

        while (i < j) {

            // iterate through columns of submatrix
            for(int m = y; m < y + k; m++){

                // swap elements of top row with bottom row
                int temp = grid[i][m];
                grid[i][m] = grid[j][m];
                grid[j][m] = temp;
            }

            // move inward
            i++;
            j--;
        }

        // return modified matrix
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

        int[][] result = reverseSubMatrix(grid, x, y, k);

        System.out.println("Output :");
        for(int[] list : result){
            System.out.println( Arrays.toString(list));
        }
    }
}
/* 
TERMINAL :
INPUT :
x = 1
y = 0
k = 3
Grid:
[1,2,3,4]
[5,6,7,8]
[9,10,11,12]
[13,14,15,16]

Output :
[1, 2, 3, 4]
[13, 14, 15, 8]
[9, 10, 11, 12]
[5, 6, 7, 16]
 */