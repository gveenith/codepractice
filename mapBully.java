import java.util.HashMap;
import java.util.Map;

public class mapBully {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "candy");
        map.put("b", "dirt");
        String temp = "";

        map.replaceAll((key, value, temp) -> {

            
            if ("a".equals(key)) {
                temp = value;
                System.out.println(temp);
                return value = "";
            } else {
                System.out.println(temp);
                return value = temp;
            }
        });
        System.out.println(map.toString());

    }

    static String bully(String key, String value, String temp) {
        System.out.println(temp);
        if ("a".equals(key)) {
            temp = value;
            System.out.println(temp);
            return value = "";
        } else {
            System.out.println(temp);
            return value = temp;
        }

    }

}
