package day5.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class lambda {
    public static void main(String[] args) {
        calc c=(int a, int b)->(a+b);
        System.out.println(c.Calculate(3,4));
        calc c1=(int a, int b)->(a+b);
        System.out.println(c1.Calculate(3,4));
        calc c2=(int a, int b)->(a+b);
        System.out.println(c.Calculate(7,4));

        //BUILTIN FUNCTIONAL INTERFACE
      Predicate<Integer> iseven=n->n%2==0;
        System.out.println(iseven.test(4));

        Consumer<String> print=s-> System.out.println("learn this");
        print.accept("heello");

        Function<String, Integer> lengthfind=s->s.length();
        System.out.println(lengthfind.apply("mradul"));

        Supplier<Integer> random=()->(6);
        System.out.println(random.get());


    }
}
