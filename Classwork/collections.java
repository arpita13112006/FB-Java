import java.util.Collections;
import java.util.ArrayList;
import java.util.Collection;
public class collections{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(67);
        list.add(69);
        list.add(47);
        list add(87);
        for(int i=0;j=list.size()-1;i<j;i++;j--){
            int temp=list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
        }
        System.out.println("reversed: "+list);  //arraylist sirf object ko hi hold krta hai
    }
}
