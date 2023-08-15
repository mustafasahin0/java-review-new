import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TaskDish {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Type.MEAT),
                new Dish("beef", false, 700, Type.MEAT),
                new Dish("chicken", false, 400, Type.MEAT),
                new Dish("fries", true, 530, Type.OTHER),
                new Dish("fruit", true, 350, Type.OTHER),
                new Dish("pizza", true, 550, Type.OTHER),
                new Dish("prawns", false, 300, Type.FISH),
                new Dish("salmon", false, 450, Type.FISH)
        );

        menu.stream().filter(each -> each.getCalories() < 400).forEach(System.out::println);

        menu.stream().map(each -> each.getName().length()).forEach(System.out::println);

        // Print 3 High Calaric Dishes > 300
        menu.stream().filter(each -> each.getCalories() > 300).map(Dish::getName).limit(3).forEach(System.out::println);

        // Print All Dish Name that are below 400 in sorted
        DishData.getAll().stream().filter(each -> each.getCalories() < 400).sorted(Comparator.comparing(Dish::getCalories)).map(Dish::getName).forEach(System.out::println);

    }
}
