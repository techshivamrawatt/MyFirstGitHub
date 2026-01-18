
import java.util.ArrayList;

public class ArrayLists {

  public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<Integer>(); // Optional

        // Add element

        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(7);
        System.out.println(list);

        // Add element at index i

        list.add(1,6);
        System.out.println(list);

        // Get element 
        int index = list.get(2);
        System.out.println(index);

        // Modify element at index i

        list.set(1, 3);
        System.out.println(list);

        // Removing an element e

        list.remove(Integer.valueOf(7)); // Remove 7 No of ArrayList


        // Remove an element at index i
        list.remove(3);  // Remove 8 No in ArrayList

        ArrayList l = new ArrayList();

        l.add("Hii");
        l.add(3);
        l.add(true);
        System.out.println(l);
        
    } 
}  