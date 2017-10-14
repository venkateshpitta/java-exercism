
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DNA {
    private final String dna;
    
    public DNA(String dna) {
        this.dna = dna;
    }
    
    public int count(char n) {
        if (dna.isEmpty() || dna==null) {
            return 0;
        }
        if(!dna.contains(Character.toString(n))) {
            throw new IllegalArgumentException();
        }
        return dna.split(Character.toString(n), -1).length-1;
    }
    
    public Map<Character, Integer> nucleotideCounts() {
        Map<Character, Integer> counts = new HashMap<>();
        Arrays.asList('A', 'C', 'G', 'T').stream().forEach((n) -> {
            counts.put(n, dna.split(Character.toString(n), -1).length-1);
        });
        return counts;
    }
}
