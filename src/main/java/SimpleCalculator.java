import java.util.Scanner;

public class SimpleCalculator {

    static double value1;
    static char operator;
    static double value2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert first value please:");
        value1 = scanner.nextDouble();

        System.out.println("Insert operation (+, -, /, *): ");
        operator = scanner.next().charAt(0);

        System.out.println("Insert second value");
        value2 = scanner.nextDouble();

        System.out.println(SimpleCalculator.calculate(value1, operator,value2));
    }



    public static double calculate(double value1, char operator, double value2 ){
        double result;
        switch (operator) {
            case '+' -> result = value1 + value2;
            case '-' -> result = value1 - value2;
            case '*' -> result = value1 * value2;
            case '/' -> {
                if (value2 != 0) {
                    result = value1 / value2;
                } else {
                    throw new IllegalArgumentException();
                }
            }
            default -> throw new IllegalArgumentException();
        }
        return result;
    }
}
