package modulo;

import java.util.LinkedList;
import java.util.Queue;



public class ProcessManager extends Process{
    private Queue<Process> queue;

    public ProcessManager() {
        queue = new LinkedList<>();
    }

    public void addProcess(Process process) {
        queue.add(process);
    }

    public String executeProcesses() {
        StringBuilder result = new StringBuilder();
        int totalTime = 0;

        while (!queue.isEmpty()) {
            Process process = queue.poll();
            result.append(process.getNombre()).append(" (").append(process.getTime()).append("s), ");
            totalTime += process.getTime();
        }

        result.append("Total execution time: ").append(totalTime).append("s");
        return result.toString();
    }
}
