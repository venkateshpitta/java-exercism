public class Hamming {
    public static Integer compute(String dna1, String dna2) {
        if (dna1 == null || dna2 == null || dna1.length() != dna2.length()) {
            throw new IllegalArgumentException();
        }
        int distance = 0;
        for (int i = 0; i < dna1.length(); i++) {
            if (dna1.charAt(i) != dna2.charAt(i)) {
                distance ++;
            }
        }
        return distance;
    }
}
