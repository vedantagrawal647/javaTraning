import java.util.*;

//Write a program that takes a List of strings as input and returns a Map where
// the keys are the strings and the values are their lengths.
public class Demo4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String> list=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list.add(sc.next());
        }
        Map<String,Integer> map = new HashMap<>();
        for (String s:list)
        {
            map.put(s,s.length());
        }

        System.out.println(map);
    }


}
