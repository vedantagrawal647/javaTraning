import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Write a program that takes a Map where the keys are strings and the values are
// integers, and returns the key with the highest value.
public class Demo10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(sc.next(), sc.nextInt());
        }

        String key = "";
        int maxVal = Integer.MIN_VALUE;

        for (String s :map.keySet())
        {
            int v=map.get(s);
            if(maxVal<=v)
            {
                maxVal=v;
                key=s;
            }
        }

        System.out.println("key "+ key);
        System.out.println("highest value "+maxVal);
    }
}
