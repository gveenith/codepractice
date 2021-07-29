import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayToMap {
    public static void main(String[] args) {
        String[] strings = new String[] { "a", "b", "a", "d" };

        List<String> stringList = Arrays.asList(strings);

 

        Map<String, Integer> wordMap = new HashMap<String, Integer>();

        // for (int i = 0; i < strings.length; i++) {
        // wordMap.put(strings[i], 0);
        // }

       System.out.println(  Arrays.stream(strings).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

        // Arrays.stream(strings).collect(Collectors.groupingBy(i -> i, 0));

        // System.out.println(wordMap);

    }
}