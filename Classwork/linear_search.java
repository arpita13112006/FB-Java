package Classwork;

public class linear_search {
    public static void main(String[] args) {
        int[] arr={5,9,30,2,1};
        int key=30;
        boolean found = false;
        for(int num:arr){
            if(num==key){
                found = true;
                break;
            }
        }
    System.out.println("found " + found);
}
}
