import java.util.PriorityQueue;

public class Queue01{

    public static void main(String[] args){

        cleanConsoleScreen();

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(01);
        queue.add(02);
        queue.add(03);
        queue.add(04);
        queue.add(05);

        System.out.println("First element on queue: " + queue.peek());
        System.out.println(queue);

        System.out.println("First element on queue removed: " + queue.poll());
        System.out.println(queue);
 
        System.out.println("New first element on queue: " + queue.peek());
        System.out.println(queue);
       
    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
