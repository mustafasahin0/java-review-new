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

    }

    private void sort(Sorting sorting) {
        sorting.sort();
    }
}
