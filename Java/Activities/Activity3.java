package activities;

public class Activity3 {
	static final double EARTH_YEAR_IN_SECONDS = 31557600;

    public static void main(String[] args) {
        long ageInSeconds = 1000000000L; // Example input

        System.out.printf("Age in seconds: %d%n", ageInSeconds);
        System.out.printf("On Earth: %.2f years%n", calculateAge(ageInSeconds, 1.0));
        System.out.printf("On Mercury: %.2f years%n", calculateAge(ageInSeconds, 0.2408467));
        System.out.printf("On Venus: %.2f years%n", calculateAge(ageInSeconds, 0.61519726));
        System.out.printf("On Mars: %.2f years%n", calculateAge(ageInSeconds, 1.8808158));
        System.out.printf("On Jupiter: %.2f years%n", calculateAge(ageInSeconds, 11.862615));
        System.out.printf("On Saturn: %.2f years%n", calculateAge(ageInSeconds, 29.447498));
        System.out.printf("On Uranus: %.2f years%n", calculateAge(ageInSeconds, 84.016846));
        System.out.printf("On Neptune: %.2f years%n", calculateAge(ageInSeconds, 164.79132));
    }

    // Method to calculate age on a planet
    public static double calculateAge(long seconds, double orbitalPeriodInEarthYears) {
        double earthYears = seconds / EARTH_YEAR_IN_SECONDS;
        return earthYears / orbitalPeriodInEarthYears;
    }

}
