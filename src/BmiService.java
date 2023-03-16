public class BmiService {
    public int calculate(double massInKilograms, double heightInMeters) {
        double heightInMetersSquared = heightInMeters * heightInMeters;
        double bmiDoubleDataType = massInKilograms / heightInMetersSquared;
        int bmi = (int) bmiDoubleDataType;
        return bmi;
    }

}
