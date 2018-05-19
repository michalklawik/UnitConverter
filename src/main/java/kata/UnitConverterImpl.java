package kata;

public class UnitConverterImpl implements UnitConverter {
    @Override
    public double celsiusToFahrenheit(double c) {
        return (c * 1.8) + 32;
    }

    @Override
    public double fahrenheitToCelsius(double f) {
        return (f - 32) / 1.8;
    }

    @Override
    public double milesToKilometers(double m) {
        return m * 1.609344;
    }

    @Override
    public double kilometersToMiles(double k) {
        return k / 1.609344;
    }

    @Override
    public double poundsToKilograms(double p) {
        return p * 0.45359237;
    }

    @Override
    public double kilogramsToPounds(double k) {
        return k / 0.45359237;
    }
}
