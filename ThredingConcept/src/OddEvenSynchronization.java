
 class SynchronizationClass{

    int count=1;

    public  synchronized void oddPrint() throws InterruptedException {
        while(count<20)
        {
            if(count%2==0)
            {
                wait();
            }
            else {
                System.out.println(count);
                count++;
                notify();
            }
        }
    }

     public  synchronized void evenPrint() throws InterruptedException {
         while(count<20)
         {
             if(count%2!=0)
             {
                 wait();
             }
             else {
                 System.out.println(count);
                 count++;
                 notify();
             }
         }
     }
}



public class OddEvenSynchronization {



    public static void main(String[] args) {

        SynchronizationClass thr = new SynchronizationClass();
        Thread oddThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thr.oddPrint();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread evenThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thr.evenPrint();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        oddThread.start();
        evenThread.start();
    }
}
