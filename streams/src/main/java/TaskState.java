import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TaskState {

    public static void main(String[] args) {

        State state = new State();
        state.addCity("Denver");
        state.addCity("New York");
        state.addCity("San Diego");

        state.getCities().forEach(System.out::println);

        // Task 2
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> doubleList = integerList.stream().map(each -> each * 2).collect(Collectors.toList());
        System.out.println(doubleList);

        // Task 3
        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);






    }
}
