import java.util.Scanner;
public class Reverse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            System.out.print(i+" ");
        }
    }
}
