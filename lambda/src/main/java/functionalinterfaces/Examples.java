package functionalinterfaces;

import java.util.function.Predicate;

public interface Examples {

    public static void main(String[] args) {

        //******************PREDICATE******************

//        Predicate<Integer> lessThan = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer < 18;
//            }
//        };
//
//        System.out.println(lessThan.test(10));

        Predicate<Integer> lessThan = a -> a < 18; // Implementation of test method that belongs to Predicate interface
        System.out.println(lessThan.test(50));

    }
}
