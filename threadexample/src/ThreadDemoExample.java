public class ThreadDemoExample{

    public static void main(String[] args) {

        Thread mainThread = Thread.currentThread();
        mainThread.setName("Gemini");


        //  higher priority
        HighPriorityTask highPriorityTask = new HighPriorityTask();
        Thread highPriorityThread = new Thread(highPriorityTask, "High Priority");
        highPriorityThread.setPriority(10);

        //  l priority
        AveragePriorityTask averagePriorityTask = new AveragePriorityTask();
        Thread averagePriorityThread = new Thread(averagePriorityTask, "Average Priority");
        averagePriorityThread.setPriority(5);

        //  lower priority
        LowPriorityTask lowPriorityTask = new LowPriorityTask();
        Thread lowPriorityThread = new Thread(lowPriorityTask, "Low Priority");
        lowPriorityThread.setPriority(1);

        // Start the thread
        highPriorityThread.start();
        averagePriorityThread.start();
        lowPriorityThread.start();

        System.out.println("Main thread " + mainThread.getName() + " started");
    }
}

class HighPriorityTask implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("High Priority Thread: i =  " + i  + " " +Thread.currentThread().getName());

        }
    }
}

class LowPriorityTask implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Low Priority Thread: i =  " + i + " " +Thread.currentThread().getName());

        }
    }
}

class AveragePriorityTask implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Average Priority Thread: i =  " + i + " " +Thread.currentThread().getName());

        }
    }
}