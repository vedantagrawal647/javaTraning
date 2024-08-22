public class SleepConceptImp implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<5;i++)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i +" "+ Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        SleepConceptImp t1 =new SleepConceptImp();
        Thread thread1 = new Thread(t1);

        SleepConceptImp t2 =new SleepConceptImp();
        Thread thread2 = new Thread(t1);

        thread1.start();
        thread2.start();
    }
}
