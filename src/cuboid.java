import java.util.*;
public class cuboid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the cube");
        double l=sc.nextDouble();
        System.out.println("Enter breadth of the cube");
        double b=sc.nextDouble();
        System.out.println("Enter height of the cube");
        double h=sc.nextDouble();
        double area=2*(l*b+b*h+h*l);
        System.out.println(area);

    }
}
