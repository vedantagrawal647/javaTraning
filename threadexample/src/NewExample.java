import java.util.Scanner;

public class NewExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n = sc.nextInt();
        NewExample obj=new NewExample();
        System.out.println(obj.encodeMessage(s,n));

    }
    public String encodeMessage(String input1,int input2)
    {
        int i=0;
        int sum=0;
        String ans="";
        String s=input1;
        int n=input2;
        while(i<s.length() && (sum+s.charAt(i)<=n))
        {
            sum=sum+s.charAt(i);
            ans=s.substring(0,i+1);
            i++;
        }
        return ans;

    }


}
