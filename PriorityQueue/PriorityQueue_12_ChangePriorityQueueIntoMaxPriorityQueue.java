import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueue_12_ChangePriorityQueueIntoMaxPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(10, Collections.reverseOrder());
        queue.add(7);
        queue.add(2);
        queue.add(10);
        queue.add(1);
        queue.add(2);
        queue.add(1);
        queue.add(8);
        queue.add(12);
        queue.add(9);
        queue.add(0);
        System.out.println("Queue: "+queue);

        System.out.print("Maximum Queue: ");
        Integer val = null;
        while ((val= queue.poll()) != null)
            System.out.print(val + " ");



    }
}
