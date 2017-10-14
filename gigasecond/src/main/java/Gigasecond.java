
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Gigasecond {
    private final LocalDateTime dateOfBirth;
    
    public Gigasecond(LocalDateTime date) {
        dateOfBirth = date;
    }
    
    public Gigasecond(LocalDate date) {
        dateOfBirth = LocalDateTime.of(date, LocalTime.MIN);
    }
    
    public LocalDateTime getDate() {
        return dateOfBirth.plusSeconds(1_000_000_000);
    }
}
