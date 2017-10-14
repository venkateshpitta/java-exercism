
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
    private final String word;
    private final char[] sortedWord;
    public Anagram(String a) {
        this.word = a.toLowerCase();
        this.sortedWord = this.word.toCharArray();
        Arrays.sort(this.sortedWord);
    }
    
    public List<String> match(List<String> words) {
        List<String> out = new ArrayList<>();
        words.stream().forEach((w) -> {
            char[] sWord = w.toLowerCase().toCharArray();
            Arrays.sort(sWord);
            if (!w.equalsIgnoreCase(this.word) 
                    && Arrays.equals(sWord, sortedWord)) {
                out.add(w);
            }
        });
        return out;
    }
}
