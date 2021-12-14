import java.util.PriorityQueue;

public class PriorityQueue_3_AddAllEleToAnotherQueue {
    public static void main(String[] args) {
        PriorityQueue<String> colorQueue = new PriorityQueue<>();
        colorQueue.add("Black");
        colorQueue.add("White");
        colorQueue.add("Blue");
        colorQueue.add("Pink");
        colorQueue.add("Maroon");
        System.out.println("colorQueue: "+colorQueue);

        PriorityQueue<String> newQueue = new PriorityQueue<>(colorQueue);
        System.out.println("New Queue: "+newQueue);

    }
}
