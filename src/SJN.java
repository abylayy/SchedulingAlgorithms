import java.util.Arrays;

public class SJN {
    static void sjnScheduling(int[] processes) {
        int[] sortedProcesses = processes.clone();
        Arrays.sort(sortedProcesses);

        int completionTime = 0;
        for (int process : sortedProcesses) {
            System.out.println("Process " + process + " started at time " + completionTime);
            completionTime += process;
        }
    }
}
