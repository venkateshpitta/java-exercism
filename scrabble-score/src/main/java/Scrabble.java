
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Scrabble {
    private static final Map<Integer, List<Character>> SCORES = new HashMap<>();
    private static void buildScores() {
        SCORES.put(1, Arrays.asList('a', 'e', 'i', 'o', 'u', 'l', 'n', 'r', 's', 't'));
        SCORES.put(2, Arrays.asList('d', 'g'));
        SCORES.put(3, Arrays.asList('b', 'c', 'm', 'p'));
        SCORES.put(4, Arrays.asList('f', 'h', 'v', 'w', 'y'));
        SCORES.put(5, Arrays.asList('k'));
        SCORES.put(8, Arrays.asList('j', 'x'));
        SCORES.put(10, Arrays.asList('q', 'z'));
    }
    
    private final String givenWord;
    
    public Scrabble(String word) {
        Scrabble.buildScores();
        givenWord = word;
    }
    
    public int getScore() {
        int score = 0;
        if (null == givenWord) return score;
        for (Character c : givenWord.toCharArray()) {
            score = SCORES.keySet().stream().filter((k) -> (SCORES.get(k).contains(Character.toLowerCase(c)))).map((k) -> k).reduce(score, Integer::sum);
        }
        return score;
    }
}
