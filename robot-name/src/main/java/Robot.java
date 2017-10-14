
import java.security.SecureRandom;

public class Robot {
    private static long number = 0;
    private static SecureRandom rnd = new SecureRandom();
    private String name;
    private String getNewName() {
        final String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String nName;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            sb.append(alphabets.charAt(rnd.nextInt(alphabets.length())));
        }
        
        String num = String.format("%03d", number);
        number++;
        
        nName = sb.toString() + num;
        
        return nName;
    }
    public Robot() {
        this.name = getNewName();
    }
    
    public String getName() {
        return this.name;
    }
    
    public String reset() {
        this.name = getNewName();
        return this.name;
    }
}