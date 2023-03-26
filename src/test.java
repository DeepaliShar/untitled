/*2 baar print hoga qki condition di h iss baar
*/
public class test {
    static void func(int n){
        if(n==0)  //base case
            return;
        System.out.println("Deepali");
        func(n-1);
    }
    public static void main(String args[]){
        func(2);
    }
}
