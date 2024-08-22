import java.util.*;

//Write a program that takes a Set of integers as input and returns a new Set
// containing only the unique elements from the input Set.
public class Demo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<Integer> set=new HashSet<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            set.add(sc.nextInt());
        }
        System.out.println(set);
    }


}
