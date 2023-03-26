import java.util.*;
public class Triangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first side");
        double s1=sc.nextDouble();
        System.out.println("Enter second side");
        double s2=sc.nextDouble();
        System.out.println("Enter third side");
        double s3=sc.nextDouble();
        double s=(s1+s2+s3)/2;
        double area=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
        System.out.println(s);
        System.out.println(area);
    }
}
