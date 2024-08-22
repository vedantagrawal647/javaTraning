import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Write a program that takes two Lists of integers as input and returns a new List
// containing only the common elements between the two Lists.
public class Demo5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        for(int i=0;i<n1;i++)
        {
            list1.add(sc.nextInt());
        }
        for(int i=0;i<n2;i++)
        {
            list2.add(sc.nextInt());
        }
        List<Integer> res = commonElementList(list1,list2);
        System.out.println(res);
    }

    private static List<Integer> commonElementList(List<Integer> list1, List<Integer> list2) {
        List<Integer> list = new ArrayList<>();

        for(int i:list1)
        {
            if(list2.contains(i))
            {
                list.add(i);
            }
        }
        return list;
    }


}
