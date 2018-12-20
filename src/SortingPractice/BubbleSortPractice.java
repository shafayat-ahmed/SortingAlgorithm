package SortingPractice;

import java.util.Arrays;

public class BubbleSortPractice {
    public static void main(String[] args) {
        int [] numbers= {8,7,4,5,1};
        System.out.println("Numbers before Bubble sort= \n" + Arrays.toString(numbers));

        boolean swap = true;
        while(swap){
            swap=false;
            for(int i=0; i<numbers.length-1;i++)
            if (numbers[i]>numbers[i+1]) {
                    int temp=numbers[i+1];
                    numbers[i+1]=numbers[i];
                    numbers[i]=temp;
                    swap=true;

            }

        }
        System.out.println("Numbers after Bubble sort=" );
        for(int j=0; j<numbers.length;j++){

            System.out.print(numbers[j] +" ");
        }

    }
}
