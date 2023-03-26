import java.util.Scanner;

public class Power {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the base ");
        int b = sc.nextInt();
        System.out.println("enter the exponential");
        int e = sc.nextInt();
        int power=1;
        while (e>0){
            power=power*b;
            e--;
        }
        System.out.println(power);
    }
}
