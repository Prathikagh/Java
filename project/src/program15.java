import java.util.Scanner;

public class program15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter marks:");
        int marks = scan.nextInt();

        if (marks < 35) {
            System.out.println("You have failed");
        }
        else if (marks < 45) {
            System.out.println("You have scored 'E' grade");
        }
        else if (marks < 55) {
            System.out.println("You have scored 'D' grade");
        }
        else if (marks < 65) {
            System.out.println("You have scored 'C' grade");
        }
        else if (marks < 75) {
            System.out.println("You have scored 'B' grade");
        }
        else if (marks < 85) {
            System.out.println("You have scored 'A' grade");
        }
        else {
            System.out.println("You have scored 'A+' grade");
        }
    }
}