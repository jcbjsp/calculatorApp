import java.util.Scanner;

public class calculatorApp {
    public static void main(String[] args) {
        calculator calc = new calculator();
        Scanner scanner = new Scanner(System.in);
        boolean moreOperations = true;
        System.out.println("Which operation? (a or s, x to exit):");
        String choice = scanner.next();
        while (!choice.equals("x")){
            System.out.println("Enter the first number:");
            int firstNumber = scanner.nextInt();
            System.out.println("Enter the second number:");
            int secondNumber = scanner.nextInt();
            if (choice.equals("a")) {
                System.out.println(calc.add(firstNumber, secondNumber));
            } else if (choice.equals("s")) {
                System.out.println(calc.subtract(firstNumber, secondNumber));
            } else {
                System.out.println("You're an idiot!");
            }
            System.out.println("Which operation? (a or s, x to exit)");
            choice = scanner.next();
        }

    }
}