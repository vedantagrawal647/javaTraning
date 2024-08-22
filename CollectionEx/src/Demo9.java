//Write a program that takes a List of strings as input and returns a Map
// where the keys are the first letters of   the strings and the values are
// Lists of strings starting with that letter.

import java.util.*;

public class Demo9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String> list=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list.add(sc.next());
        }
        Map<Character,List<String>> map = new HashMap<>();
        for (String s:list)
        {
            char c=s.charAt(0);
            if(!map.keySet().contains(c))
            {
                List<String> l = new ArrayList<>();
                l.add(s);
                map.put(c,l);
            }
            else {
                List<String> ll = map.get(c);
                ll.add(s);
                map.put(c,ll);
            }
        }

        System.out.println(map);
    }

}
