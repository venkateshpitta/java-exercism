public class Acronym {
    public static String generate(String phrase) {
        StringBuilder acronym = new StringBuilder("");
        String[] words = phrase.split("[-\\s+]");
        for(String word: words) {
            if (word.equals(word.toUpperCase()) || word.equals(word.toLowerCase())) {
                acronym.append(word.toUpperCase().charAt(0));
            } else {
                for (char c: word.toCharArray()) {
                    if (Character.isUpperCase(c)) {
                        acronym.append(c);
                    }
                }
            }
        }
        return acronym.toString();
    }
}
