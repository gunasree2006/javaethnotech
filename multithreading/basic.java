package learningthreads.threads.basics;

public class basics {
    public static void main(String args[]){ //main is also a thread
        System.out.println("hello world");
        System.out.println(Thread.currentThread().getName());
    }
}
