import java.util.PriorityQueue;

public class PriorityQueue_9_RetrieveAndRemoveFirstElement {
    public static void main(String[] args) {
        PriorityQueue<String> colorQueue = new PriorityQueue<>();
        colorQueue.add("Black");
        colorQueue.add("White");
        colorQueue.add("Blue");
        colorQueue.add("Pink");
        colorQueue.add("Maroon");
        System.out.println("colorQueue 1: "+colorQueue);
        System.out.println("Retrieve And RemoveFirst Element: "+colorQueue.poll());
        System.out.println("colorQueue 1: "+colorQueue);

    }
}
