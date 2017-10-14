
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordCount {
    public Map<String, Integer> phrase(String s) {
        Map<String, Integer> out = new HashMap<>();
        String[] words = s.replaceAll("[^a-zA-Z0-9]", " ")
                .toLowerCase().split("\\s+");
        Set<String> wordSet = new HashSet<>();
        wordSet.addAll(Arrays.asList(words));
        wordSet.stream().forEach((word) -> {
            Integer count = 0;
            for(String w : words) {
                if(word.equals(w)) {
                    count ++;
                }
            }
            out.put(word, count);
        });
        return out;
    }
}
