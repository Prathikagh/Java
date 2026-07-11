import java.util.Scanner;

public class subject103 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        int N=scan.nextInt();

        for(int i=1;i<=N;i++){
            if(i%5==0){
                break;

            }
            System.out.println(i);
        }
        scan.close();
        }
    }

