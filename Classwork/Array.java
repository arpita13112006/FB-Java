package Classwork;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr={5,3,1,4,2};
        
        System.out.println("original:" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("sorted:" + Arrays.toString(arr));

        int[] copy = Arrays.copyOf(arr,7);
        System.out.println("copy:" + Arrays.toString(copy));

        Arrays.fill(copy,6);
        System.out.println("filled:" + Arrays.toString(copy));


        
    }
}
