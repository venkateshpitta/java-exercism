import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Allergies {
    private final int score;
    public Allergies(int given) {
        score = given;
    }
    
    public boolean isAllergicTo(Allergen allergen) {
        return (allergen.getScore() & score) == allergen.getScore();
    }
    
    public List<Allergen> getList() {
        return Arrays.stream(Allergen.values())
                .filter(this::isAllergicTo)
                .collect(Collectors.toList());
    }
}
