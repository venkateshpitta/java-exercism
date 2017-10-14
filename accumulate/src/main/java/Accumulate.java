
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Accumulate {
    public static <T> List<T> accumulate(List<T> input, Function<T, T> func) {
        List<T> out = new ArrayList<>();
        input.stream().forEach((item) -> {
            out.add((T) func.apply(item));
        });
        return out;
    }
}
