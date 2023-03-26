import java.util.*;
public class Week {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if(num==1)
            System.out.println("Sunday");
        if(num==2)
            System.out.println("Monday");
        if(num==3)
            System.out.println("Tuesday");
        if(num==4)
            System.out.println("Wednesday");
        if(num==5)
            System.out.println("Thursday");
        if(num==6)
            System.out.println("Friday");
        if(num==7)
            System.out.println("Saturday");
        else
            System.out.println("Enter number b/w 1 to 7");
    }
}
