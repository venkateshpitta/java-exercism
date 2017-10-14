import com.google.common.base.CharMatcher;

public class Cipher {
    public Cipher(String given) {
        if (!CharMatcher.JAVA_LOWER_CASE.matchesAllOf(given)) {
            throw new IllegalArgumentException();
        }
    }
}
