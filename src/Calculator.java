public class Calculator {
    public double add(double a, double b) {
        return a + b;

    }

    public double minus(double a, double b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result1 = calculator.add(5.10,4.90);
        System.out.println(result1);

        double result2 = calculator.minus(5.10,4.90);
        System.out.println(result2);

    }
}
