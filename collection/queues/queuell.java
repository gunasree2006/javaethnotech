package collections.arraylist.queue;

import java.util.LinkedList;
import java.util.*;
public class queue_ll {
    static void main() {
        Queue<Integer>q=new LinkedList<>();// we cannot create object for inteface so we are extending linkedlist
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q.remove());
        q.clear();
        System.out.println(q.poll());
        q.offer(4);
        q.offer(5);
        System.out.println(q.peek());

    }
}
