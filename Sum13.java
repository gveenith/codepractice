import java.util.stream.Stream;

public class Sum13 {

    public static void main(String[] args) {
        
        Stream.of(1,2,2,1,13,1).reduce((acc,cur) -> cur != 13 ? cur : skip)

    }

}