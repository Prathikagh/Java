import java.util.Scanner;

public class subject84 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.next();
        System.out.println(firstCharacter(input));
    }

    public static char firstCharacter(String str) {
        if (str == null || str.isEmpty()) {
            return '\0';
        }
        return str.charAt(0);
    }
}