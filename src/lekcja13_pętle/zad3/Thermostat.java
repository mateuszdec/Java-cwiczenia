package lekcja13_pętle.zad3;

public class Thermostat {
    private double currentTemperature;
    private int targetTemperature;

    Thermostat(double currentTemperature, int targetTemperature) {
        this.currentTemperature = currentTemperature;
        this.targetTemperature = targetTemperature;
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public int getTargetTemperature() {
        return targetTemperature;
    }

    boolean targetTemperatureReached() {
        return currentTemperature == targetTemperature;
    }

    void adjustTemperature() {
        double temperatureDiff = targetTemperature - currentTemperature;
        if (temperatureDiff > 0) {
            currentTemperature += 0.5;
        } else if (temperatureDiff < 0) {
            currentTemperature -= 0.5;
        }
    }
}
