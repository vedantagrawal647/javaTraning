public class JoinMethodConcept {

    public static void main(String[] args) throws InterruptedException {

        OddPrint t1 = new OddPrint();
        Thread thread1 = new Thread(t1);

        EvenPrint t2 = new EvenPrint();
        Thread thread2 = new Thread(t2);

        thread1.start();
        thread2.start();
        thread2.join();
    }

}

class OddPrint implements Runnable{

    @Override
    public void run() {
        for (int i=1;i<20;i++)
        {
            System.out.println(i + " " +Thread.currentThread().getName());
            i++;
        }
    }
}

class EvenPrint implements Runnable{

    @Override
    public void run() {
        for (int i=2;i<=20;i++)
        {
            System.out.println(i + " " +Thread.currentThread().getName());
            i++;
        }
    }
}