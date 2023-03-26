/*neveer terminating condition
 stack overflow hojayega
 infinite cl hoga*/

public class recursion {
    static void func1(){
        System.out.println("Deepali");
        func1();
    }
    public static void main(String args[]){
        func1();
    }
}
