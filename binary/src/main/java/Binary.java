public class Binary {
    private final String input;
    public Binary(String binary) {
        input = binary;
    }
    
    public int getDecimal() {
        int decimal = 0;
        char[] reversed = new StringBuilder(input).reverse().toString().toCharArray();
        for (int i = 0; i < reversed.length; i++) {
            switch (reversed[i]) {
                case '1':
                    decimal = decimal + 1 * (int) Math.pow(2, i);
                    break;
                case '0':
                    break;
                default:
                    return 0;
            }
        }
        return decimal;
    }
}
