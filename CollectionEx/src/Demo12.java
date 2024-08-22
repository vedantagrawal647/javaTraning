import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
interface  D{

    default void m1(){
        System.out.println("Hello");
    }





}

class P implements D{
    void m1()
    {
        System.out.println("world");
    }
}

public class Demo12 {
    public static void main(String[] args) {
        List<Integer> ls=List.of(1,2,3,4,5);
        Predicate<Integer> p=(i) -> i%2==0;
        for( int i : ls)
        {
            if(p.test(i))
            {
                System.out.println(i);
            }
        }

//        List<String> ls1=List.of("Vedant","rahul");
       Consumer<List<String>> c=(strings) -> {
           strings.forEach(str -> System.out.println(str.toUpperCase()));
        };

    }
}

