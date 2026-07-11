import java.util.Scanner;
public class program11 {
    public static void main(String[] args){
        Scanner Scan =new Scanner (System.in);
        System.out.println("enter the rollnumer");
        int rollnum= Scan.nextInt();
        System.out.println("enter the rollno:"+rollnum);
        System.out.println("enter the hight");
        float height = Scan.nextFloat();
        System.out.println("enter the height:"+ height);
        System.out.println("Are you married say true / false");
        boolean ms= Scan.nextBoolean();
        System.out.println("enter the rollno:"+rollnum);
        System.out.println("enter your  frist name");
        String name= Scan.next();
        System.out.println("Entered name: " + name);
        System.out.println("enter ypur message");
        String msg= Scan.nextLine();
        System.out.println("enterd message :"+msg);
    }
}
