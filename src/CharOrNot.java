import java.util.*;
public class CharOrNot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a alphabet");
        char ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z' || ch <= 'Z' && ch >= 'A')
            System.out.println("Character");
        else
            System.out.println("Not a Character");
    }
}
