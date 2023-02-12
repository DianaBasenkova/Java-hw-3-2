public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightMetres = 1.87; // метров
        double weightKgm = 98; //килограмм
        int index = (int) service.calculate(heightMetres, weightKgm);

        System.out.println(index);
    }
}