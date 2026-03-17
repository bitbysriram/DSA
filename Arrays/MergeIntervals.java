import java.util.*;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals){

        // sort intervals based on starting time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        // take first interval as current
        int[] current = intervals[0];

        for(int[] interval : intervals){

            // check if current interval overlaps with next
            if(interval[0] <= current[1]){

                // merge by updating end time
                current[1] = Math.max(current[1], interval[1]);
            }
            else{
                // store merged interval
                result.add(current);

                // move to next interval
                current = interval;
            }
        }

        // add last interval
        result.add(current);

        // convert list to 2D array
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of intervals :");
        int n = sc.nextInt();

        int[][] intervals = new int[n][2];

        System.out.println("Enter the intervals (start end) :");

        for(int i = 0; i < n; i++){
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }

        int[][] result = merge(intervals);

        System.out.println("Merged intervals are:");

        for(int[] arr : result){
            System.out.print("[" + arr[0] + "," + arr[1] + "] ");
        }
    }
}
/* 
TERMINAL
Enter no. of intervals :
4
Enter the intervals (start end) :
1
3
2
6
8
10
15
18
Merged intervals are:
[1,6] [8,10] [15,18]
 */