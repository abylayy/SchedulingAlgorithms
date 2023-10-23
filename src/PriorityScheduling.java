import java.util.Arrays;

public class PriorityScheduling {
    static void priorityScheduling(int[] processes, int[] priorities) {
        int n = processes.length;
        int[][] combined = new int[n][2];
        for (int i = 0; i < n; i++) {
            combined[i][0] = processes[i];
            combined[i][1] = priorities[i];
        }

        Arrays.sort(combined, (a, b) -> Integer.compare(a[1], b[1]));

        int completionTime = 0;
        for (int[] pair : combined) {
            System.out.println("Process " + pair[0] + " started at time " + completionTime);
            completionTime += pair[0];
        }
    }
}
