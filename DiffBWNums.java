
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;

public class DiffBWNums {

    public static void main(String[] args) {
        // List<Integer> arr = Arrays.asList(1, 6, 3, 8, 10);
        int[] arr = new int[] { 1, 6, 3, 8, 10 };
        OptionalInt high = Arrays.stream(arr).reduce(Integer::max);
        OptionalInt low = Arrays.stream(arr).reduce(Integer::min);
        System.out.println(high.getAsInt());
        System.out.println(low.getAsInt());
    }

}