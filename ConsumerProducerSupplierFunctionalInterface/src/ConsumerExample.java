//Cunsumer Functional Interface : It is an functional interface which is
// used when we want to consume an object (means take an input as a parameter)
// but doesn't return any value(not return any output)
//it contain 2 method andThen and accept
// void accept(T t)

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<Integer> consumer = t -> System.out.println(t);
        //   consumer.accept(10);
        //in java 8 forEach function introduce which uses Consumer functional interface

        List<Integer> lists = Arrays.asList(1,2,3,4,5);
       // lists.forEach(consumer);
        lists.forEach(t -> System.out.println(t));


    }
}
