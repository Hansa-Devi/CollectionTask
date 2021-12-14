import java.util.PriorityQueue;

public class PriorityQueue_7_CompareTwoQueue {
    public static void main(String[] args) {
        PriorityQueue<String> colorQueue = new PriorityQueue<>();
        colorQueue.add("Black");
        colorQueue.add("White");
        colorQueue.add("Blue");
        colorQueue.add("Pink");
        colorQueue.add("Maroon");
        System.out.println("colorQueue 1: "+colorQueue);

        PriorityQueue<String> colorQueue2  = new PriorityQueue<>();
        colorQueue2.add("Maroon");
        colorQueue2.add("Black");
        colorQueue2.add("Red");
        colorQueue2.add("Green");
        colorQueue2.add("NavyBlue");
        System.out.println("ColorQueue 2: "+colorQueue2);

        PriorityQueue<String> compare = new PriorityQueue<>();
        for (String e: colorQueue) {
            compare.add(colorQueue2.contains(e)?"Yes":"No");
        }
        System.out.println(compare);


    }
}
