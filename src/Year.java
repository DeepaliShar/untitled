import java.util.*;
public class Year {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();
        if (year % 4 == 0 || (year & 400) == 0)
            System.out.println("Leap year");
        else {
            if (year % 100 == 0)
                System.out.println("not leap year");
        }
    }
}
