
import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Long> getForNumber(long input) {
        List<Long> out = new ArrayList<>();
        while (input % 2 == 0) {
            input /= 2;
            out.add(2L);
        }
        long factoriser = 3;
        while (input > 1) {
            while (input % factoriser == 0) {
                input /= factoriser;
                out.add(factoriser);
            }
            factoriser += 2;
        }
        return out;
    }
}
