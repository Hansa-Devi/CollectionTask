import java.util.PriorityQueue;

public class PriorityQueue_8_RetrieveFirstElement {
    public static void main(String[] args) {
        PriorityQueue<String> colorQueue = new PriorityQueue<>();
        colorQueue.add("Black");
        colorQueue.add("White");
        colorQueue.add("Blue");
        colorQueue.add("Pink");
        colorQueue.add("Maroon");
        System.out.println("colorQueue 1: "+colorQueue);
        System.out.println("FirstElement: "+ colorQueue.peek());
    }
}
