
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RnaTranscription {
    public static String ofDna(String dna) {
        String out = "";
        Map<Character, Character> fromDnaToRna = new HashMap<>();
        fromDnaToRna.put('G', 'C');
        fromDnaToRna.put('C', 'G');
        fromDnaToRna.put('T', 'A');
        fromDnaToRna.put('A', 'U');
//        for (char c : dna.toCharArray()) {
//            out += fromDnaToRna.get(c);
//        }
        out = dna.chars().mapToObj(c -> (char) c).map(s -> fromDnaToRna.get(s).toString()).collect(Collectors.joining());
        return out;
    }
}
