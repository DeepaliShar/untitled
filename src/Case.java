import java.util.Scanner;
public class Case {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a alphabet");
        char ch = sc.next().charAt(0);
        if(ch>='a' && ch<='z')
            System.out.println("Lower Case");
        else if(ch>='A' && ch=='Z')
            System.out.println("Upper Case");
    }
}
