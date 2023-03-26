import java.util.Scanner;
public class Maximum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = sc.nextInt();
        System.out.println("Enter a number");
        int num2 = sc.nextInt();
        System.out.println("Enter a number");
        int num3 = sc.nextInt();
        int max=Math.max(num1,num2);
        int output=Math.max(max,num3);
        System.out.println("Maximum is "+max);
    }
}
