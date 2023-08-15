import java.util.stream.Stream;

public class TaskFibonacci {

    public static void main(String[] args) {
        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]}).limit(20).forEach(t -> System.out.println("(" + t[0] + "," + t[1] + ")"));
        // How does it work? Iterate needs a lambda to specify the successor element.
        // In the case of the tuple (3, 5) the successor (5, 3+5) = (5, 8)

    }
}
