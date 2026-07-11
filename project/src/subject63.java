import java.util.SplittableRandom;

public class subject63 {
    public static void main(String[] args) {
        double result = calculateSI(1000, 5, 2);
        System.out.println(result);
    }

    public static double calculateSI(double p, double r, double t) {
        double simpleInterest = (p * r * t) / 100;
        return simpleInterest;
    }
}


