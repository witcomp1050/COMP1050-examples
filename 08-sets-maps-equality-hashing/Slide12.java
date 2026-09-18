import java.util.HashMap;
import java.util.Map;

public class Slide12 {
    public static void main(String[] args) {
        Map<String, Integer> stock = new HashMap<>();
        stock.put("laptop", 4);
        stock.put("camera", 2);
        stock.put("laptop", 3);
        System.out.println(stock.get("laptop"));
        System.out.println(stock.get("tripod"));
        System.out.println(stock.getOrDefault("tripod", 0));
        System.out.println(stock.containsKey("camera") + " " + stock.size());
    }
}
