import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Strain {
    public static <T> List<T> keep(List<T> list, Predicate<T> predicate) {
        List<T> out = new ArrayList<>();
        for (T l : list) {
            if (predicate.test(l)) {
                out.add(l);
            }
        }
        return out;
//        return list.stream().filter(predicate).collect(Collectors.toList());
    }
    
    public static <T> List<T> discard(List<T> list, Predicate<T> predicate) {
        return Strain.keep(list, predicate.negate());
//        return list.stream().filter(predicate.negate()).collect(Collectors.toList());
    }
}
