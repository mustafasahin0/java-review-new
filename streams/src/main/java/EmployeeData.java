import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll() {
        return Stream.of(
                new Employee(100, "Mike", "mike@test.com", Arrays.asList("2012498764", "2012498765")),
                new Employee(100, "Ozzy", "ozzy@test.com", Arrays.asList("2012498766", "2012498767")),
                new Employee(100, "Peter", "peter@test.com", Arrays.asList("2012498768", "2012498769"))
        );
    }
}
