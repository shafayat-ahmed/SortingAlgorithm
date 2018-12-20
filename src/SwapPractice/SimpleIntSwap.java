package SwapPractice;

public class SimpleIntSwap {
    public static void main(String[] args) {


        int a = 10;
        int b = 20;
        System.out.println("Before swap:");
        System.out.println("a="+a +" "+"b="+b );

        int temp;
        temp = a;

        a = b;
        b = temp;
        System.out.println("After swap:");
        System.out.println("a="+a +" "+"b="+b );
    }
}
