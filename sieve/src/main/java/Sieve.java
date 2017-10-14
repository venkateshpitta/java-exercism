
import java.util.ArrayList;
import java.util.List;

public class Sieve {
    private final int limit;
    public Sieve(int given) {
        limit = given;
    }
    public List<Integer> getPrimes() {
        List<Integer> out = new ArrayList<>();
        out.add(2);
        for (int i = 3; i < limit; i += 2) {
            boolean isPrime = true;
            for (int o : out) {
                if (i % o == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                out.add(i);
            }
        }
        return out;
    }
}
