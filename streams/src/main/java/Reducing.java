import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4, 5, 3, 9);
        int result = numbers.stream().reduce(0, Integer::sum);
        System.out.println(result);

        // No initial Value
        Optional<Integer> results2 = numbers.stream().reduce(Integer::sum);
        System.out.println(results2.get());

        // Max and Min
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);

        System.out.println(min);
        System.out.println(max);

        // Task
        Optional<Integer> sum = DishData.getAll().stream()
                .map(each -> 1)
                .reduce(Integer::sum);
        System.out.println(sum);

        Long dishCount = DishData.getAll().stream().count();
        System.out.println(dishCount);


    }
}
