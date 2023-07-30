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
        mySet.add(new Student(9, "Muhabbbet"));

        System.out.println(mySet);

        Set<Integer> numSet = new HashSet<>();
        numSet.add(1);
        numSet.add(2);
        numSet.add(2);

        System.out.println("First Repeating: " + firstRepeatingChar("Java Developer"));

    }


    public static Character firstRepeatingChar(String str) {
        //Create a hashmap
        Set<Character> charSet = new HashSet<>();

        //Iteration return char if add returns false
        for (Character eachChar : str.toCharArray())
            if (!charSet.add(eachChar))
                return eachChar;
        return null;
    }
}
