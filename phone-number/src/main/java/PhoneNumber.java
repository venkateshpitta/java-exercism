public class PhoneNumber {
    private String cleansed;
    public PhoneNumber(String num) {
        cleansed = num.replaceAll("[^0-9]", "");
        if (cleansed.length() < 10 || cleansed.length() > 11) {
            cleansed = "0000000000";
        }
        if (cleansed.length() == 11) {
            if (cleansed.charAt(0) == '1') {
                cleansed = cleansed.substring(1);
            } else {
                cleansed = "0000000000";
            }
        }
    }
    
    public String getNumber() {
        return cleansed;
    }
    
    public String getAreaCode() {
        return cleansed.substring(0, 3);
    }
    
    public String pretty() {
        return "(" + cleansed.substring(0,3) + ") " 
                + cleansed.substring(3,6) + "-" 
                + cleansed.substring(6);
    }
}
