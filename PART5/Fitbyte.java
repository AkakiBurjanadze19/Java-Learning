package PART5;

public class Fitbyte {
    private int age;
    private double restingHeartRate;

    public Fitbyte(int age, double restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum) {
        double maximumHeartRate = 206.3 - (0.711 * this.age);
        double targetHeartRate = (maximumHeartRate - this.restingHeartRate) * (percentageOfMaximum) + this.restingHeartRate;
        return targetHeartRate;
    }
}
