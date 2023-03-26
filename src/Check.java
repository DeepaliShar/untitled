import java.util.*;
public class Check {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a alphabet");
        char ch = sc.next().charAt(0);
        if(ch>='a' && ch<='z' || ch<='Z' && ch>='A')
            System.out.println("alphabet");
        else if(ch>='0' && ch<='9')
            System.out.println("Number");
        else
            System.out.println("Special Character");
    }
}
