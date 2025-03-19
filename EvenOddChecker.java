import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        // Step 1: Get integer input from the user
        int number = getIntegerInput();

        // Step 2: Determine if it's even or odd
        String result = checkEvenOrOdd(number);

        // Step 3: Display the result
        System.out.println(result);
    }

    // Method to get a valid integer input from the user
    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Enter an integer: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                br
