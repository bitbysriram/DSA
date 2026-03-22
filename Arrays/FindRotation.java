import java.util.*;

public class FindRotation {

    public boolean findRotation(int[][] mat, int[][] target) {

        // try all 4 rotations
        for(int i = 0; i < 4; i++){

            // check if matrices match
            if(isEqual(mat, target)){
                return true;
            }

            // rotate matrix by 90 degrees
            rotate(mat);
        }

        return false;
    }

    public void rotate(int[][] mat){

        int n = mat.length;

        // transpose matrix
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){

                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // reverse each row
        for(int i = 0; i < n; i++){

            int left = 0;
            int right = n - 1;

            while(left < right){

                int temp = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = temp;

                left++;
                right--;
            }
        }
    }

    public boolean isEqual(int[][] mat, int[][] target){

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){

                if(mat[i][j] != target[i][j]){
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of matrix (n):");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];
        int[][] target = new int[n][n];

        System.out.println("Enter first matrix:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter target matrix:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                target[i][j] = sc.nextInt();
            }
        }

        FindRotation obj = new FindRotation();

        boolean result = obj.findRotation(mat, target);

        System.out.println("Can obtain by rotation: " + result);
    }
}
/* 
TERMINAL
Enter size of matrix (n):
3
Enter first matrix:
[0,0,0]
[0,1,0]
[1,1,1]
Enter target matrix:
[1,1,1] 
[0,1,0]
[0,0,0]
Can obtain by rotation: true
 */