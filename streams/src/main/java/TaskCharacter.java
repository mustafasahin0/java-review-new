import java.util.Arrays;
import java.util.List;

public class TaskCharacter {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("Java", "Apple", "Honda", "Developer");
        // 1
        words.forEach(word -> System.out.println(word + ": " + word.length()));

        // 2
        words.stream()
                .map(String::length)
                .forEach(System.out::println);

        // 3
        words.stream().forEach(each -> System.out.println(each + ": " + each.length()));
    }
}
