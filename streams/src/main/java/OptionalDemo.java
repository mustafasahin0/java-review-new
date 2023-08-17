import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 4, 2, 10, 23);

        // 1. empty() - isPresent()
        Optional<String> empty = Optional.empty();
        System.out.println(empty.isPresent());
        System.out.println(Optional.of(numbers).isPresent());

        // 2. ifPresent()
        Optional<Integer> bigNumber = numbers.stream()
                .filter(x -> x > 100)
                .findAny();
        System.out.println(bigNumber.isPresent());

        // 3. get()
//        System.out.println(bigNumber.get());

        // 4. orElse()
        System.out.println(bigNumber.orElse(0));
    }
}
