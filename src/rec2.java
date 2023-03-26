/*1
2
1
3
1
2
1
*/
public class rec2 {
    static void func(int n){
        if(n==0)  //base case
            return;
        func(n-1);
        System.out.println(n);
        func(n-1);
    }
    public static void main(String args[]){
        func(3);
    }
}
