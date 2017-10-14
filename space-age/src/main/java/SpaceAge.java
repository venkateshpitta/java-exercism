public class SpaceAge {
    private final double givenAgeInYears;
    public static final double earthYearInSeconds = 31557600;
    public static final double mercuryYearInSeconds = earthYearInSeconds * 0.2408467;
    public static final double venusYearInSeconds = earthYearInSeconds * 0.61519726;
    public static final double marsYearInSeconds = earthYearInSeconds * 1.88088158;
    public static final double jupiterYearInSeconds = earthYearInSeconds * 11.862615;
    public static final double saturnYearInSeconds = earthYearInSeconds * 29.447498;
    public static final double uranusYearInSeconds = earthYearInSeconds * 84.016846;
    public static final double neptuneYearInSeconds = earthYearInSeconds * 164.79132;
    public SpaceAge(double age) {
        this.givenAgeInYears = age;
    }
    
    public double getSeconds() {
        return this.givenAgeInYears;
    }
    
    public double onEarth() {
        return givenAgeInYears / SpaceAge.earthYearInSeconds;
    }
    
    public double onMercury() {
        return givenAgeInYears / SpaceAge.mercuryYearInSeconds;
    }
    
    public double onVenus() {
        return givenAgeInYears / SpaceAge.venusYearInSeconds;
    }
    
    public double onMars() {
        return givenAgeInYears / SpaceAge.marsYearInSeconds;
    }
    
    public double onJupiter() {
        return givenAgeInYears / SpaceAge.jupiterYearInSeconds;
    }
    
    public double onSaturn() {
        return givenAgeInYears / SpaceAge.saturnYearInSeconds;
    }
    
    public double onUranus() {
        return givenAgeInYears / SpaceAge.uranusYearInSeconds;
    }
    
    public double onNeptune() {
        return givenAgeInYears / SpaceAge.neptuneYearInSeconds;
    }
}
