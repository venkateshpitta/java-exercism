public class Bob {
    public String hey(String input) {
        String out;
        if (input.trim().isEmpty()) {
            out = "Fine. Be that way!";
        } else if (input.toLowerCase().equals(input.toUpperCase())) {
            if (input.endsWith("?")) {
                out = "Sure.";
            } else {
            out = "Whatever.";
            }
        } else if (input.toUpperCase().equals(input)) {
            out = "Whoa, chill out!";
        } else if (input.endsWith("?")) {
            out = "Sure.";
        } else {
            out = "Whatever.";
        }

        return out;
    }
}
