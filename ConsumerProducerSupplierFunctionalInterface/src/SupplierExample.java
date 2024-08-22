import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

//Supplier Functional interface - It is an functional interface which
// is used in all context where we don't need to take input but may return output
//It has method T get();
//which does not take any input but return an output
public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hi hello supplier";
     //   System.out.println(supplier.get());

        //In java 8 in stream api when we don't get result
        // in that case if we want to return some dummy data
        //or some meaning ful data then we use supplier functional interface
        List<String> list = Arrays.asList();
        //System.out.println( list.stream().findAny().orElseGet(supplier) );
        System.out.println( list.stream().findAny().orElseGet( () -> "Hi hello supplier") );
        //orElse take supplier interface

    }
}
