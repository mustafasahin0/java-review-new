import java.util.ArrayList;
import java.util.List;

public class ArraySorting {

    public static void main(String[] args) {



        ArraySorting as = new ArraySorting();
//        as.sort();

        QuickSort quickSort = new QuickSort();
        BubbleSort bubbleSort = new BubbleSort();

        as.sort(quickSort);
        as.sort(bubbleSort);

        List<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple("Green", 200));
        appleList.add(new Apple("Red", 100));
        appleList.add(new Apple("Green", 400));
        appleList.add(new Apple("Red", 100));


    }

    private void sort(Sorting sorting) {
        sorting.sort();
    }
}
