import java.util.ArrayList;

public class array_list {
    public static void main(String[] args) {
        ArrayList<Integer> integeres = new ArrayList<>();
        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<Double>  doubles = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Strawberry");
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
        // clear an array list
        fruits.clear();
        System.out.println(fruits);
        // size of array list
        System.out.println(fruits.size());
    }
}
