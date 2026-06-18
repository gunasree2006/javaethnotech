package learningthreads.threads;
class message{
    boolean ismsg=false;
    public synchronized void reciver() throws InterruptedException{
        while(!ismsg){
            System.out.println("waiting for msg");
            wait();
        }
        System.out.println("msg recieved");
    }

public void sender(){
    ismsg=true;
    System.out.println("msg sent");
    //notify();
}
}
public class interthreadcommunication {
    public static void main(String args[])throws InterruptedException{
        message ms=new message();
        Thread t1=new Thread(()->{
            try{
                ms.reciver();
            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        });
        Thread t2=new Thread(()->
        {  try {
            Thread.sleep(3000);
            ms.sender();
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
