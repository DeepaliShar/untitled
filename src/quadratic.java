import java.util.*;
public class quadratic {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        double a=sc.nextDouble();
        System.out.println("Enter the value of b");
        double b=sc.nextDouble();
        System.out.println("Enter the value of c");
        double c=sc.nextDouble();
        double d=(b*b)-(4*a*c);
        double sqrt=Math.sqrt(d);
        if(d>0){
            double firstroot=(-b+sqrt)/2*a;
            double secondroot=(-b-sqrt)/2*a;
            System.out.println(firstroot);
            System.out.println(secondroot);
        }
        else{
            if(d==0)
                System.out.println((-b+sqrt)/2*a);
        }

    }
}
