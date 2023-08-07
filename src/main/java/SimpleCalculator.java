import java.util.Scanner;

public class SimpleCalculator {

    private double value1;
    private char operator;
    private double value2;
    private final Scanner scanner = new Scanner(System.in);


    public void run(){

        boolean isValidInput = false;
        while(!isValidInput){
            System.out.println("Insert first value please (must be a number): ");
            if (scanner.hasNextDouble()){
                value1 = scanner.nextDouble();
                isValidInput = true;
            }else {
                System.out.println("Incorrect input try again : ");
                scanner.nextLine();
            }
        }
        isValidInput = false;

        while(!isValidInput){
            System.out.println("Insert operator please (+, -, *, /): ");
            String input = scanner.next().trim();
            if (input.length() == 1 && "+-*/".contains(input)){
               operator = input.charAt(0);
                isValidInput = true;
            }else {
                System.out.println("Incorrect operator try again : ");
                scanner.nextLine();
            }
        }
        isValidInput = false;

        while(!isValidInput){
            System.out.println("Insert second value please (must be a number): ");
            if (scanner.hasNextDouble()){
                value2 = scanner.nextDouble();
                isValidInput = true;
            }else {
                System.out.println("Incorrect input try again : ");
                scanner.nextLine();
            }
        }
        scanner.close();

        System.out.println(calculate( value1, operator, value2));
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
