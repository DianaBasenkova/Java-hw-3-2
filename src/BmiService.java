public class BmiService {
    public double calculate(double heightMetres, double weightKgm) {
        double index = weightKgm / (heightMetres * heightMetres);
        int result = (int) index;
        return result;

    }
}