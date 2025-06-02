import java.util.Scanner;

public class MultiNumberCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask how many numbers
        System.out.print("Enter the number of values: ");
        int count = scanner.nextInt();

        // Validate input
        if (count < 2) {
            System.out.println("You need at least 2 numbers to perform a calculation.");
            return;
        }

        double[] numbers = new double[count];

        // Read numbers
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        // Choose operation
        System.out.print("Choose operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = numbers[0];

        // Perform operation
        for (int i = 1; i < count; i++) {
            switch (operator) {
                case '+':
                    result += numbers[i];
                    break;
                case '-':
                    result -= numbers[i];
                    break;
                case '*':
                    result *= numbers[i];
                    break;
                case '/':
                    if (numbers[i] == 0) {
                        System.out.println("Error: Division by zero.");
                        return;
                    }
                    result /= numbers[i];
                    break;
                default:
                    System.out.println("Invalid operator.");
                    return;
            }
        }

        // Output result
        System.out.println("Result: " + result);
    }
}