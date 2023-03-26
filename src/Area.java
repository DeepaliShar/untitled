import java.util.Scanner;

public class Area {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a angle: ");
        int angle1=sc.nextInt();
        System.out.print("Enter a angle: ");
        int angle2=sc.nextInt();
        System.out.print("Enter a angle: ");
        int angle3=sc.nextInt();
        if (angle1!=0 && angle2!=0 && angle3!=0){
            if((angle1+angle2+angle3)==180)
                System.out.println("Valid Trangle");
            else
                System.out.println("Not Valid");
        }
        else
            System.out.println("Not Valid");
    }
}
