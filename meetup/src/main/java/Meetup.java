
import org.joda.time.DateTime;

public class Meetup {
    private final DateTime givenDate;
    public Meetup(int m, int y) {
        givenDate = new DateTime(y, m, 1, 0, 0, 0);
    }
    
    public DateTime day(int dayOfWeek, MeetupSchedule givenSchedule) {
        DateTime out = new DateTime(givenDate);
        while (out.getDayOfWeek() != dayOfWeek) {
            out = out.plusDays(1);
        }
        
        switch (givenSchedule) {
            case FIRST:
                break;
            case SECOND:
                out = out.plusWeeks(1);
                break;
            case THIRD:
                out = out.plusWeeks(2);
                break;
            case FOURTH:
                out = out.plusWeeks(3);
                break;
            case TEENTH:
                while (out.getDayOfMonth() < 13) {
                    out = out.plusWeeks(1);
                }
                break;
            case LAST:
                out = out.dayOfMonth()
                        .withMaximumValue()
                        .dayOfWeek()
                        .setCopy(dayOfWeek);
                if (out.getMonthOfYear() != givenDate.getMonthOfYear()) {
                    out = out.dayOfWeek().addToCopy(-7);
                }
                break;
            default:
                out = null;
        }
        
        return out;
    }
}
