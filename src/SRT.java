import java.util.ArrayList;
import java.util.List;

public class SRT {
    static void srtScheduling(int[] processes) {
        List<Integer> remainingTime = new ArrayList<>();
        for (int process : processes) {
            remainingTime.add(process);
        }

        int currentTime = 0;
        while (!remainingTime.isEmpty()) {
            int shortestIndex = remainingTime.indexOf(remainingTime.stream().min(Integer::compare).orElseThrow());
            int process = remainingTime.get(shortestIndex);
            System.out.println("Process " + process + " started at time " + currentTime);
            currentTime++;
            remainingTime.set(shortestIndex, remainingTime.get(shortestIndex) - 1);

            if (remainingTime.get(shortestIndex) == 0) {
                remainingTime.remove(shortestIndex);
            }
        }
    }
}
