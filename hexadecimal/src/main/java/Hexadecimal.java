import java.util.HashMap;
import java.util.Map;

public class Hexadecimal {
    public static int toDecimal(String hexa) {
        int out = 0;
        Map<Character, Integer> fromHexToDec = new HashMap<>();
        fromHexToDec.put('0', 0);
        fromHexToDec.put('1', 1);
        fromHexToDec.put('2', 2);
        fromHexToDec.put('3', 3);
        fromHexToDec.put('4', 4);
        fromHexToDec.put('5', 5);
        fromHexToDec.put('6', 6);
        fromHexToDec.put('7', 7);
        fromHexToDec.put('8', 8);
        fromHexToDec.put('9', 9);
        fromHexToDec.put('a', 10);
        fromHexToDec.put('b', 11);
        fromHexToDec.put('c', 12);
        fromHexToDec.put('d', 13);
        fromHexToDec.put('e', 14);
        fromHexToDec.put('f', 15);
        int significance = 0;
        for (char c : new StringBuffer(hexa).reverse().toString().toLowerCase().toCharArray()) {
            if (null == fromHexToDec.get(c)) {
                out = 0;
                break;
            }
            out += fromHexToDec.get(c) * Math.pow(16, significance ++);
        }
        return out;
    }
}
