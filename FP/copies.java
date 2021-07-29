package FP;

import java.util.Arrays;
import java.util.List;

public class copies {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "bb", "ccc");
        strings.stream().map(s -> s.repeat(3)).forEach(System.out::println);

    }

}
