import java.util.PriorityQueue;

public class PriorityQueue_5_RemoveAllElements {
    public static void main(String[] args) {
        PriorityQueue<String> colorQueue = new PriorityQueue<>();
        colorQueue.add("Black");
        colorQueue.add("White");
        colorQueue.add("Blue");
        colorQueue.add("Pink");
        colorQueue.add("Maroon");
        System.out.println("colorQueue: "+colorQueue);
        colorQueue.clear();
        System.out.println("After Removing all elements:"+colorQueue);
    }
}
