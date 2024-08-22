//class MyRunnable implements Runnable{
//
//    @Override
//    public void run() {
//        System.out.println("child" );
//    }
//}

import java.util.HashMap;
import java.util.Map;

public class ThreadDemo{
//    public static void main(String[] args) {
//        MyRunnable runnable = new MyRunnable();
//        Thread t = new Thread(runnable);
//        t.run();
//    }
public static void main(String[] args) {
    Map<String,Integer> obj =new HashMap<>();
    obj.put("1",1);
    System.out.println(obj);
}

}