import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueue_10_CovertQueueIntoArray {
    public static void main(String[] args) {
        PriorityQueue<String> colorQueue = new PriorityQueue<>();
        colorQueue.add("Black");
        colorQueue.add("White");
        colorQueue.add("Blue");
        colorQueue.add("Pink");
        colorQueue.add("Maroon");
        System.out.println("colorQueue 1: "+colorQueue);

        String [] arrayQueue = new String[colorQueue.size()];
        colorQueue.toArray(arrayQueue);
        System.out.println("Queue into Array: "+Arrays.toString(arrayQueue));
    }
}
