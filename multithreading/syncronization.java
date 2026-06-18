package learningthreads.threads.basics;
class myrace{
    int count=0;
    public synchronized  void increment(){

        count++;
    }
}
//System.out.println("this is block synchronization");
        /* synchronized(this){
        count++;
         */
public class syncronization {
    public static void main(String args[])throws Exception{
        myrace r=new myrace();
        Thread t1=new Thread(()->{
            for(int i=1;i<=1000;i++){
                r.increment();
            }
        }
                );
        Thread t2=new Thread(()->{
            for(int i=1;i<=1000;i++){
                r.increment();
            }
        }
        );
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(r.count);
    }
}
