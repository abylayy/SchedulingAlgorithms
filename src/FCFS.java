import java.util.Scanner;

public class FCFS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of processes: ");
        int n = scanner.nextInt();

        int[] arrivalTimes = new int[n];
        int[] burstTimes = new int[n];
        int[] waitingTimes = new int[n];
        int[] turnaroundTimes = new int[n];

        System.out.println("Enter arrival times and burst times for each process:");
        for (int i = 0; i < n; i++) {
            arrivalTimes[i] = scanner.nextInt();
            burstTimes[i] = scanner.nextInt();
        }

        waitingTimes[0] = 0;
        turnaroundTimes[0] = burstTimes[0];

        for (int i = 1; i < n; i++) {
            waitingTimes[i] = turnaroundTimes[i - 1];
            turnaroundTimes[i] = waitingTimes[i] + burstTimes[i];
        }

        System.out.println("Process | Arrival Time | Burst Time | Waiting Time | Turnaround Time");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + " | " + arrivalTimes[i] + " | " + burstTimes[i] + " | " +
                    waitingTimes[i] + " | " + turnaroundTimes[i]);
        }
    }
}
