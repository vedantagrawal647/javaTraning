import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

// Predicate is a functional interface which is used for conditional check
//it take an input and return boolean value
//it has method test -- boolean test(T t)
// T  can be any wrapper class
public class PredicateExample {

    public static void main(String[] args) {

//        Predicate<Integer> predicate = (t) -> {
//            if(t%2==0)
//            {
//                return true;
//            }
//            else {
//                return false;
//            }
//        };
//        boolean res=predicate.test(10);
//        System.out.println(res);

        /*
         filter is a function that is apply on stream api for conditional check
         is use a Supplier interface
        */
        Predicate<Integer> predicate = t -> t % 2==0;
        List<Integer> list = Arrays.asList(1,2,3,4,5);
     //   list.stream().filter(predicate).forEach(t-> System.out.println(t));
        list.stream().filter(t -> t%2==0).forEach(t-> System.out.println(t));


    }
}
