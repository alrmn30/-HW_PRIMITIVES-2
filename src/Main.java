public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        System.out.println(service.calculate(98, 1.87));
        System.out.println(service.calculate(50, 1.52));
        System.out.println(service.calculate(80, 1.75));
        System.out.println(service.calculate(100, 1.83));
    }
}
