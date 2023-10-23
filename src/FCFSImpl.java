public class FCFSImpl {
    public static void main(String[] args) {
        int[] processes = {1, 5, 7};
        fcfsScheduling(processes);
    }

    static void fcfsScheduling(int[] processes) {
        int completionTime = 0;
        for (int process : processes) {
            System.out.println("Process " + process + " started at time " + completionTime);
            completionTime += process;
        }
    }
}
