import java.util.PriorityQueue;

public class PriorityQueue_6_CountNumberOfElements {
    public static void main(String[] args) {
        PriorityQueue<String> colorQueue = new PriorityQueue<>();
        colorQueue.add("Black");
        colorQueue.add("White");
        colorQueue.add("Blue");
        colorQueue.add("Pink");
        colorQueue.add("Maroon");
        System.out.println("colorQueue: "+colorQueue);
        System.out.println("Number of Elements: "+colorQueue.size());
    }
}
