import java.util.PriorityQueue;

public class PriorityQueue_11_ConvertElementINStringRepresentation {
    public static void main(String[] args) {
        PriorityQueue<String> colorQueue = new PriorityQueue<>();
        colorQueue.add("Black");
        colorQueue.add("White");
        colorQueue.add("Blue");
        colorQueue.add("Pink");
        colorQueue.add("Maroon");
        System.out.println("colorQueue 1: "+colorQueue);

        String str;
        str = colorQueue.toString();
        System.out.println("Queue in String Representation:"+str);
    }
}
