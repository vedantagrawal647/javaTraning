interface A{
    abstract  void m1();

}
public class Demo11 {
    public static void main(String[] args) {
        A obj = () -> {
            System.out.println("Hello");
        };

        obj.m1();
        //n->{return n*n;};
    }
}
