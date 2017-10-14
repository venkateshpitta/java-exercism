import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Atbash {
    private static final String FALPHABETS = IntStream.rangeClosed('a', 'z')
            .mapToObj(c -> "" + (char) c)
            .collect(Collectors.joining());
    private static final String BALPHABETS = new StringBuilder(FALPHABETS)
            .reverse().toString();
    public static String encode(String input) {
        StringBuilder out = new StringBuilder();
        int counter = 0;
        for (Character c : input.replaceAll("[,.;\\s+]", "").toLowerCase().toCharArray()) {
            if (counter > 4) {
                counter = 0;
                out.append(" ");
            }
            counter ++;
            if (-1 != FALPHABETS.indexOf(c)) {
                out.append(BALPHABETS.charAt(FALPHABETS.indexOf(c)));
            } else {
                out.append(c);
            }
        }
        return out.toString();
    }
    
    public static String decode(String input) {
        StringBuilder out = new StringBuilder();
        for (Character c : input.replaceAll("[,.;\\s+]", "").toLowerCase().toCharArray()) {
            if (-1 != BALPHABETS.indexOf(c)) {
                out.append(FALPHABETS.charAt(BALPHABETS.indexOf(c)));
            } else {
                out.append(c);
            }
        }
        return out.toString();
    }
}