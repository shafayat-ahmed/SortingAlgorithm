package SwapPractice;

public class SwapByMultiplyDivision {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("Before swapping:");
        System.out.println("a="+a +" "+"b=" +b);

        a=a*b; //200
        b=a/b;//10
        a=a/b; //20

        System.out.println("After swapping:");
        System.out.println("a="+a +" "+"b=" +b);
    }
}

