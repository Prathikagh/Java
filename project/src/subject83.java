import java.util.Scanner;
public class subject83 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");

            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            if (choice == 1) {
                System.out.println("Result = " + (a + b));
            }
            else if (choice == 2) {
                System.out.println("Result = " + (a - b));
            }
            else if (choice == 3) {
                System.out.println("Result = " + (a * b));
            }
            else if (choice == 4) {
                if (b != 0) {
                    System.out.println("Result = " + (a / b));
                } else {
                    System.out.println("Cannot divide by zero!");
                }
            }
            else {
                System.out.println("Invalid choice!");
            }
        }

}
