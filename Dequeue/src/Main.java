import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedBlockingDeque<>();
        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        deque.offer(4);
        deque.offer(5);
        deque.offer(6);

        for(Integer element: deque){
            System.out.println(element);
        }

        deque.addFirst(0);
        deque.removeLast();

        for(Integer element: deque){
            System.out.println(element);
        }
    }
}