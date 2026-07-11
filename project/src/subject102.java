
import java.util.Scanner;
public class subject102 {
    public static void main(String[] args) {
        System.out.println("enter the number");
     Scanner sc=new Scanner(System.in);
     int N =sc.nextInt();

    for(int i=1;i>=N;i++){
        if(i%5==0){
            System.out.println(i);
        }
    }
    }
}

