package functionalinterfaces;

import java.util.function.*;

public class Examples {

    public static void main(String[] args) {

        //******************PREDICATE******************

        Predicate<Integer> lessThan = a -> a < 18; // Implementation of test method that belongs to Predicate interface
        System.out.println(lessThan.test(50));

        //******************CONSUMER******************

        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(5);

        //******************BICONSUMER******************

        BiConsumer<Integer, Integer> addTwo = (x, y) -> System.out.println(x + y);
        addTwo.accept(100, 200);

        //******************FUNCTION******************

        Function<String, String> fun = s -> "Hello " + s;
        String str = fun.apply("Ozzy");
        System.out.println(str);

        System.out.println(fun.apply(("Apple")));

        //******************SUPPLIER******************

        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());

        Predicate<Integer> pred = (p) -> p % 2 == 0 ? true : false;
        System.out.println(pred.test(10));

        BiConsumer<Integer, String> bn = (x, y) -> System.out.println(x + y);
        bn.accept(5, "apple");

    }
}
