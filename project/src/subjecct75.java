import java.util.Scanner;
public class subjecct75 {
    public static double doubleDouble(double value) {
        return value * 2;
    }
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a double  number:");
        double input = scan.nextDouble();
        double output=doubleDouble(input);
        double num=scan.nextDouble();
        System.out.println("Double value:"+output);
    }
}
