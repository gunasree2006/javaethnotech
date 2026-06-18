package collections.arraylist.queue;

import java.util.*;
public class dequeue {
    static void main() {
        Deque<Integer> d=new ArrayDeque<>();
        d.addFirst(10);
        d.addFirst(15);
        d.addLast(20);
        d.addLast(25);
        d.addLast(30);
        System.out.println(d);
        d.remove(30);
        System.out.println(d);
    }
}
