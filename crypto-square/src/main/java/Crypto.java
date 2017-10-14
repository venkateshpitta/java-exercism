import java.util.ArrayList;
import java.util.List;
import com.google.common.base.Splitter;

public final class Crypto {

    private final String input;
    public Crypto(String given) {
        input = given;
    }
    public String getNormalizedPlaintext() {
        String out;
        out = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        return out;
    }
    
    public int getSquareSize() {
        int out;
        out = (int) Math.ceil(Math.sqrt(getNormalizedPlaintext().length()));
        return out;
    }
    
    public List<String> getPlaintextSegments() {
        List<String> out = new ArrayList<>();
        for (String substring : Splitter.fixedLength(getSquareSize()).split(getNormalizedPlaintext())) {
            out.add(substring);
        }
        return out;
    }
    
    public String getCipherText() {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < getSquareSize(); i++) {
            for (String word : getPlaintextSegments()) {
                if (i >= word.length()) {
                    continue;
                }
                out = out.append(word.charAt(i));
            }
        }
        return out.toString();
    }
    
    public String getNormalizedCipherText() {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < getSquareSize(); i++) {
            for (String word : getPlaintextSegments()) {
                if (i >= word.length()) {
                    out = out.append(" ");
                    break;
                }
                out = out.append(word.charAt(i));
            }
            out = out.append(" ");
        }
        return out.toString().trim().replaceAll("  ", " ");
    }
}