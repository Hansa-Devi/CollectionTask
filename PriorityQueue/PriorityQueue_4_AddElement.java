import java.util.PriorityQueue;

public class PriorityQueue_4_AddElement {
    public static void main(String[] args) {
        PriorityQueue<String> colorQueue = new PriorityQueue<>();
        colorQueue.add("Black");
        colorQueue.add("White");
        colorQueue.add("Blue");
        colorQueue.add("Pink");
        colorQueue.add("Maroon");
        System.out.println("colorQueue: "+colorQueue);
        colorQueue.offer("Yellow");
        System.out.println("After adding Yellow:");
        System.out.println(colorQueue);
    }
}
