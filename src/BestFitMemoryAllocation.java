import java.util.Arrays;

public class BestFitMemoryAllocation {
    static void bestFitMemoryAllocation(int[] taskBurstTimes, int[] blockSizes) {
        int[] sortedTasks = Arrays.copyOf(taskBurstTimes, taskBurstTimes.length);
        Arrays.sort(sortedTasks);

        boolean[] blockAllocated = new boolean[blockSizes.length];
        Arrays.fill(blockAllocated, false);

        int[] completionTimes = new int[taskBurstTimes.length];
        Arrays.fill(completionTimes, 0);

        for (int task : sortedTasks) {
            int bestFitIndex = -1;
            for (int i = 0; i < blockSizes.length; i++) {
                if (!blockAllocated[i] && blockSizes[i] >= task) {
                    if (bestFitIndex == -1 || blockSizes[i] < blockSizes[bestFitIndex]) {
                        bestFitIndex = i;
                    }
                }
            }

            if (bestFitIndex != -1) {
                blockAllocated[bestFitIndex] = true;
                completionTimes[bestFitIndex] += task;
            }
        }

        for (int i = 0; i < completionTimes.length; i++) {
            System.out.println("Block " + (char) ('A' + i) + " - Completion Time: " + completionTimes[i]);
        }
    }
}
