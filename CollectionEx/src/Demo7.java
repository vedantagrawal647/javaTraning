//Write a program that takes a List of strings as input and returns a new
// List where each string is reversed.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Demo7 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String> list=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list.add(sc.next());
        }
        List<String> res = reversedStringList(list);
        System.out.println(res);
    }

    private static List<String> reversedStringList(List<String> list) {
        List<String> res = new ArrayList<>();
        for (String s:list)
        {
            String reverse = reverseString(s);
            res.add(reverse);
        }
        return res;
    }

    private static String reverseString(String s) {
        String reverse = "";
        for(int i=0;i<s.length();i++)
        {
            reverse += s.charAt(s.length()-1-i);
        }
        return reverse;
    }

}
