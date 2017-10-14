import org.apache.commons.lang3.StringUtils;

public class Trinary {
    public static int toDecimal(String given) {
        int decimal = 0;
        
        if (!StringUtils.isNumeric(given) ||
                given.contains("3") ||
                given.contains("4") ||
                given.contains("5") ||
                given.contains("6") ||
                given.contains("7") ||
                given.contains("8") ||
                given.contains("9")) {
            return decimal;
        }
        
        int significance = 0;
        int input = Integer.parseInt(given);
        while (input > 0) {
            decimal = decimal + (input % 10) * (int) Math.pow(3, significance);
            significance ++;
            input /= 10;
        }
        return decimal;
    }
}
