import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TaskState {

    public static void main(String[] args) {

        State va = new State();
        va.addCity("McLean");
        va.addCity("Arlington");
        va.addCity("FallsChurch");

        State tx = new State();
        tx.addCity("Dallas");
        tx.addCity("Plano");
        tx.addCity("Austin");
        tx.addCity("Houston");

        List<State> list = Arrays.asList(va, tx);
        list.stream().map(State::getCities).forEach(System.out::println);

        list.stream()
                .map(State::getCities)
                .flatMap(List::stream)
                .forEach(System.out::println);

        // Task 2
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> doubleList = integerList.stream().map(each -> each * 2).collect(Collectors.toList());
        System.out.println(doubleList);

        // Task 3
        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);






    }
}
