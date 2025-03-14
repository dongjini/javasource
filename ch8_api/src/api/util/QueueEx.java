package api.util;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        // Queue<String> queue = new Queue<String>() { }; -> X // queue는 인터페이스라 new 를
        // 사용할 수 없음.
        Queue<String> queue = new LinkedList<>();

        queue.offer("사과");
        queue.offer("바나나");
        queue.offer("딸기");
        queue.offer("포도");
        queue.offer("귤");

        while (!queue.isEmpty()) {
            // FIFO
            System.out.println(queue.poll());
        }

    }
}
