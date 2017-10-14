import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Etl {
   public Map<String, Integer> transform(Map<Integer, List<String>> old) {
       Map<String, Integer> out = new HashMap<>();
       Set<Integer> nums = old.keySet();
       nums.stream().forEach((num) -> {
           old.get(num).stream().forEach((s) -> {
               out.put(s.toLowerCase(), num);
           });
       });
       return out;
//       return null;
   }
}
