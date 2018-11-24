package ls16.tsk3;

import ls16.tsk1.HeavyBox;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        Deque<HeavyBox> deque = new ArrayDeque<>();
        deque.offer(new HeavyBox(2,2,2,2));
        deque.offer(new HeavyBox(7,7,7,7));
        while (!deque.isEmpty()){
            System.out.println(deque.pop());
        }
    }
}
