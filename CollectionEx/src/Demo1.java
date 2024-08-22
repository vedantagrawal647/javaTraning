import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Write a program that takes a List of integers as input and returns a new
// List containing only the prime numbers from the input List.
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list.add(sc.nextInt());
        }
        List<Integer> res = primeList(list,n);
        System.out.println(res);
    }

    public static List<Integer> primeList(List<Integer> list,int size)
    {
        List<Integer> newList= new ArrayList<>();
        for(int i=0;i<size;i++)
        {
            if(isPrime(list.get(i)))
            {
                newList.add(list.get(i));
            }
        }
        return newList;
    }
    public static boolean isPrime(int k)
    {
        if(k==0 || k==1){
            return false;
        }
        for(int i=2;i<k;i++)
        {
            if(k%i==0)
            {
                return false;
            }
        }
        return true;
    }


}
