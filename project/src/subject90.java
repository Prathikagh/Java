
import java.util.Scanner;

public class subject90 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Stsring number and ending number");
        int n = scan.nextInt();
        int m = scan.nextInt();
        int sum = 0;

        for (int i = n; i<m; i++ ) {
            if(i%3==0 ||  i%5==0 || i%7==0){
                continue;
            }
            System.out.println(sum + " + " + i + " = " );
            sum += i;
            System.out.println(sum);

        }
        System.out.println();





    }


}