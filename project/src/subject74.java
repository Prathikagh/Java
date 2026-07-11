import java.util.Scanner;
public class subject74 {
    public static  int doubleByte(byte num) {

        return num * 2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputLine = scan.nextLine();
        byte value =scan.nextByte();
        int result = doubleByte(value);
        System.out.println(result);
        scan.close();
    }


}
