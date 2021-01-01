package ca.ioxom.part5.learningobjectorientedprogramming;

public class Fitbyte {
    private final int age;
    private final int restingHeartRate;
    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum) {
        return (206.3 - (0.711 * age)) * percentageOfMaximum;
    }

    public static void main(String[] arrgs) {
        Fitbyte assistant = new Fitbyte(30, 60);

        double percentage = 0.5;

        while (percentage < 1.0) {
            double target = assistant.targetHeartRate(percentage);
            System.out.println("Target " + (percentage * 100) + "% of maximum: " + target);
            percentage = percentage + 0.1;
        }
    }
}
