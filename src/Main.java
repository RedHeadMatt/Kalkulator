public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        float x, y;

        x = calculator.APlusB(4.5, 3.9);
        y = calculator.AMinusB(10, 9.2);

        System.out.printf("%f\t%f", x, y);
    }
}