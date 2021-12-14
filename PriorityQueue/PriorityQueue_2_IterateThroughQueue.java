import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue_2_IterateThroughQueue {
    public static void main(String[] args) {
        PriorityQueue<String> colorQueue = new PriorityQueue<>();
        colorQueue.add("Black");
        colorQueue.add("White");
        colorQueue.add("Blue");
        colorQueue.add("Pink");
        colorQueue.add("Maroon");

        Iterator it = colorQueue.iterator();
        System.out.print("ColorQueue: ");
        while (it.hasNext())
            System.out.print(it.next()+", ");
    }
}
