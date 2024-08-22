import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Write a program that takes a List of integers as input and returns a new
// List where each element is squared.
public class Demo8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list.add(sc.nextInt());
        }
        List<Integer> res = new ArrayList<>();
        for(int i:list)
        {
            res.add((int)Math.pow(i,2));
        }
        System.out.println(res);
    }

}
