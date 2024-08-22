public class YieldMethodExample implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread started "+Thread.currentThread().getName());
        Thread.yield();
        System.out.println("Thread ended "+Thread.currentThread().getName());

    }

    public static void main(String[] args) {

        YieldMethodExample  t1 = new YieldMethodExample();
        Thread thread1 = new Thread(t1,"First Thread");
        thread1.setPriority(5);

        YieldMethodExample  t2 = new YieldMethodExample();
        Thread thread2 = new Thread(t2,"Second thread");

        thread1.start();
        thread2.start();

    }


}

