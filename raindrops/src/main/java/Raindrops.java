public class Raindrops {
    public static String convert(int input) {
        String out = "";
        if (input % 3 == 0) {
            out += "Pling";
        }
        if (input % 5 == 0) {
            out += "Plang";
        }
        if (input % 7 == 0) {
            out += "Plong";
        }
        if (input % 3 != 0 && input % 5 != 0 && input % 7 != 0) {
            out = Integer.toString(input);
        }
        return out;
    }
}
