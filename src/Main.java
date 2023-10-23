import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] processes = {7, 5, 1};
        System.out.println("FCFS");
        FCFSImpl.fcfsScheduling(processes);

        System.out.println("\nSJN");
        SJN.sjnScheduling(processes);

        System.out.println("\nPriority Scheduling");
        int[] priorities = {2, 1, 3};
        PriorityScheduling.priorityScheduling(processes, priorities);

        System.out.println("\nSRT");
        SRT.srtScheduling(processes);

        System.out.println("\nBest Fit Memory Allocation");
        int[] taskBurstTimes = {5, 2, 22, 11};
        int[] blockSizes = {6, 4, 8};
        BestFitMemoryAllocation.bestFitMemoryAllocation(taskBurstTimes, blockSizes);
    }
}
