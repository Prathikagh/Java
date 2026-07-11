
import java.util.Scanner;
public class subject104 {
    public static void main(String[] args) {
        System.out.println("enter the number");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    int sum=0;
    for(int i=1;i<=10;i++){
        if(n%3==0){
            System.out.println("Number"+i+"is skipped");
            sum+=i;
            System.out.println("Number"+i+"is curreny sum"+sum);


        }
    }
        System.out.println("Final sum:"+sum);
    }
}
