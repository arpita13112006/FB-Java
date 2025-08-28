package Classwork;

public class Reverse_OneDArray {
   public static void main(String[] args) {
        int[] marks = {1, 2, 3, 4, 5};
        int start = 0;
        int end = marks.length - 1;

        while (start < end) {
            int temp = marks[start];
            marks[start] = marks[end];
            marks[end] = temp;

            start++;
            end--;
        }

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Element at index " + i + ": " + marks[i]);
        }
    }
}
