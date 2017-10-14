import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class School {
    private final Map<Integer, List<String>> namesList;
    public School() {
        namesList = new HashMap<>();
    }
    
    public Map<Integer, List<String>> isEmpty() {
        return namesList;
    }
    
    public void add(String name, int grade) {
        List<String> nNames;
        if (namesList.containsKey(grade)) {
            nNames = namesList.get(grade);
        } else {
            nNames = new ArrayList<>();
        }
        nNames.add(name);
        namesList.put(grade, nNames);
    }
    
    public List<String> grade(int g) {
        List<String> out;
        if (namesList.containsKey(g)) {
            out = namesList.get(g);
        } else {
            out = new ArrayList<>();
        }
        return out;
    }
    
    public Map<Integer, List<String>> db() {
        return namesList;
    }
    
    public Map<Integer, List<String>> sort() {
        namesList.keySet().stream().forEach((key) -> {
            List<String> temp = namesList.get(key);
            temp.sort(null);
            namesList.put(key, temp);
        });
        return namesList;
    }
}
