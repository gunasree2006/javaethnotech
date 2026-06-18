package learningthreads.threads.basics;
class mythreads extends Thread{
    @Override
   public  void run(){
        System.out.println("run the threads");
    }
}
public class lifecycleofthreads {
    public static void main(String args[]){
        System.out.println("the creation of thread");
        mythreads t=new mythreads();

        System.out.println(t.getState());
        t.start();
        System.out.println(t.getState());

    }
}
/*
+---------+
|  NEW    |
+---------+
     |
     | start()
     v
+--------------+
|  RUNNABLE    |
+--------------+
     |
     | waiting / sleep / join / I/O
     v
+-------------------+
| NON-RUNNABLE      |
| (Blocked /        |
|  Waiting /        |
|  Timed Waiting)   |
+-------------------+
     |
     | notify() / time over / lock released
     v
+--------------+
|  RUNNABLE    |
+--------------+
     |
     | run() ends
     v
+--------------+
| TERMINATED   |
+--------------+
 */
/*
Stage	State Name	  Description	                       Common Methods / Cause
1️⃣	 NEW	       Thread object is created but not started	      new Thread()
2️⃣	 RUNNABLE	   Thread is ready to run; waiting for CPU	   start()
3️⃣	RUNNING	      Thread is currently executing	                  CPU scheduler allocates CPU
4️⃣	NON-RUNNABLE	Thread is temporarily inactive	          sleep(), wait(), join(), I/O, lock
5️⃣	TERMINATED	    Thread execution completed	             run() ends
 */
