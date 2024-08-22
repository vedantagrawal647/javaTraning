
//
public class Demo1 {
    public static void main(String[] args) {

        EvenDemo t1 = new EvenDemo();
        Thread thread1 = new Thread(t1);

        OddDemo t2 = new OddDemo();
        Thread thread2 = new Thread(t2);

        thread1.start();
        thread2.start();
    }
}

 class EvenDemo implements Runnable{

     @Override
     public void run() {
         for(int i=2;i<=20;i++){
             System.out.println(i);
             i++;
         }
     }
 }

class OddDemo implements Runnable{

    @Override
    public void run() {
        for(int i=1;i<=20;i++){
            System.out.println(i);
            i++;
        }
    }
}