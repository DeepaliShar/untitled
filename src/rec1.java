/*3
2
1
1
2
3
*/
public class rec1 {
    static void func(int n){
        if(n==0)  //base case
            return;
        System.out.println(n);
        func(n-1);
        System.out.println(n);
    }
    public static void main(String args[]){
        func(3);
    }
}
