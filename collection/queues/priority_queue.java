package collections.arraylist.queue;

import java.util.PriorityQueue;

public class priority_queue {
    static void main() {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.offer(10);
        pq.offer(20);
        pq.offer(15);
        pq.offer(25);
        pq.offer(9);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

    }
}
