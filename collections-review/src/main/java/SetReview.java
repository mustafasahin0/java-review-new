import java.util.HashSet;
import java.util.Set;

public class SetReview {

    public static void main(String[] args) {

        // 1. Create a Set
        Set<Student> mySet = new HashSet<>();

        // 2. Add elements to the Set
        mySet.add(new Student(7, "Ibadet"));
        mySet.add(new Student(8, "Ahmet"));
        mySet.add(new Student(9, "Muhabbbet"));

        System.out.println(mySet);

        Set<Integer> numSet = new HashSet<>();
        numSet.add(1);
        numSet.add(2);
        numSet.add(2);

        System.out.println(numSet);
        System.out.println(numSet.add(2));

    }
}
