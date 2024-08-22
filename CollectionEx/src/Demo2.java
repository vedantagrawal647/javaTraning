import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;//Write a program that takes a List of strings as input and returns a new List
// containing only the strings that are palindromes.
public class Demo2
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String> list=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list.add(sc.next());
        }
        List<String> res = pallindromeList(list,n);
        System.out.println(res);
    }

    public static List<String> pallindromeList(List<String> list,int size)
    {
        List<String> newList= new ArrayList<>();
        for(int i=0;i<size;i++)
        {
            if(isPallindrome(list.get(i)))
            {
                newList.add(list.get(i));
            }
        }
        return newList;
    }
    public static boolean isPallindrome(String s)
    {

        int i=0;
        int j=s.length()-1;

        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
