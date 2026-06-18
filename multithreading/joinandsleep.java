package learningthreads.threads.basics;
class mythread extends Thread{
    public void run(){
        System.out.println("the run method");
        {
            //System.out.println("Thread is running...");
            for (int i = 1; i <=3; i++) {
                try{
                    Thread.sleep(1000);
                    System.out.println(i+" i am ");
                }
                catch (InterruptedException e){
                    System.out.println(e.getMessage());
                }

            }
        }

    }
    }

public class joinandsleep {

        public static void main(String[] args) {
            System.out.println("The Creation of Thread");
            mythread t=new mythread();
            //System.out.println(t.getState());//new
            t.start();
            //Thread

            for (int i = 1; i <= 3; i++) {
                try {
                    Thread.sleep(1000);
                    t.join();  // it wait the method until to execte the mythread class
                    System.out.println(i+"I am main");
                }
                catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }

            }
            //System.out.println(t.getState());//runnable
        }
    }

