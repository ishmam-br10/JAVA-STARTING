import java.util.ArrayList;
import java.util.Collections;

public class array_list {
    public static void main(String[] args) {
        ArrayList<Integer> integeres = new ArrayList<>();
        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<Double>  doubles = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Strawberry");
        fruits.add("Banana");
        System.out.println(fruits); //[Apple, Banana, Strawberry]
        // by using the below method we can add an element
        // wherever we want
        fruits.add(2, "Jackfruit at 2");
        System.out.println(fruits);
        // change a value
        fruits.set(2, "Orange");
        System.out.println(fruits);
        // remove an element
        fruits.remove(2);
        System.out.println(fruits);
        // size of array list
        System.out.println(fruits.size());
        // // clear an array list
         // fruits.clear();
        // System.out.println(fruits);
        // size of array list
        System.out.println(fruits.size());
        // sort an array list
        System.out.println("Unsorted " +fruits);
        Collections.sort(fruits);
        System.out.println(fruits);

        // iterate over an array list
        for(String item: fruits){
            System.out.println(item +" ");
        }
    }
}
