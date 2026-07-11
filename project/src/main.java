import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputLine = scan.nextLine(); // optional
        byte value = scan.nextByte();

        int result = doubleByte(value);
        System.out.println(result);

        scan.close();
    }

    public static int doubleByte(byte value) {
        return value * 2;
    }
}
