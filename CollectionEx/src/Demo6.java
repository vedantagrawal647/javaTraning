import java.util.*;

//Write a program that takes a List of integers as input and returns the largest
// and smallest elements in the List.
public class Demo6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        System.out.println("largest no. is "+list.get(list.size()-1));
        System.out.println("largest no. is "+list.get(0));
    }


}
