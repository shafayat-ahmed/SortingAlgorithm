package SwapPractice;

public class StringSwap {
    public static void main(String[] args) {
        String a="oh";
        String b="no";
        System.out.println("Before swapping:");
        System.out.println("a="+a +" "+"b=" +b);

        a=a+b;

        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());


        System.out.println("After swapping:");
        System.out.println("a="+a +" "+"b=" +b);
    }
}
