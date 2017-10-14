public class RomanNumeral {
    private final int given;
    public RomanNumeral(int input) {
        given = input;
    }
    public String getRomanNumeral() {
        int input = this.given;
        String out = "";
        if (input < 0 || input > 3000) {
            out = "Invalid number to represent in Roman numerals";
        }
        if (input == 0) {
            return out;
        }
        while (input >= 1000) {
            out += "M";
            input -= 1000;
        }
        while (input >= 900) {
            out += "CM";
            input -= 900;
        }
        while (input >= 500) {
            out += "D";
            input -= 500;
        }
        while (input >= 400) {
            out += "CD";
            input -= 400;
        }
        while (input >= 100) {
            out += "C";
            input -= 100;
        }
        while (input >= 90) {
            out += "XC";
            input -= 90;
        }
        while (input >= 50) {
            out += "L";
            input -= 50;
        }
        while (input >= 40) {
            out += "XL";
            input -= 40;
        }
        while (input >= 10) {
            out += "X";
            input -= 10;
        }
        while (input >= 9) {
            out += "IX";
            input -= 9;
        }
        while (input >= 5) {
            out += "V";
            input -= 5;
        }
        while (input >= 4) {
            out += "IV";
            input -= 4;
        }
        while (input >= 1) {
            out += "I";
            input -= 1;
        }
        return out;
    }
}
