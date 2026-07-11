import java.util.Scanner;
public class program14 {
    public static void main(System[]arg){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter marks");
       int marks = scan.nextInt();
       if(marks<35)
       {
           System.out.println("Your marks is fail");
       }
       if(marks>35){
           System.out.println("Your marks is fail");
       }
        {
           if (marks >= 35 && marks < 45)
                System.out.println("your have scored 'e'grade");
        }
        {
            if (marks >= 45 && marks < 55)
                System.out.println("your have scored 'd'grade");
        }
        {
            if (marks >= 55 && marks < 65)
                System.out.println("your have scored 'c'grade");
        }
        {
            if(marks>=65 && marks<75)
                System.out.println("your have scored 'b'grade");
        }
        {
            if(marks>=75 && marks<85)
                System.out.println("your have scored 'A'grade");

        }
        {
            System.out.println("your have scored 'A+'grade");
        }
    }

}
