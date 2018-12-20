package SwapPractice;

public class SwapByBitwiseOp {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("Before swapping:");
        System.out.println("a="+a +" "+"b=" +b);

        a=a^b;
        b=b^a;
        a=a^b;


        System.out.println("After swapping:");
        System.out.println("a="+a +" "+"b=" +b);
    }
}
