import java.util.Scanner;

public class array_example_3 {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 3, 5, 7, 7, 9, 9, 3, 7, 7};
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter a new number: ");
        int taken = Input.nextInt();
        counter(numbers, taken);
    }
    public static void counter(int[] numbers, int taken) {
        int count = 0;
        for(int i =0; i< numbers.length; i++){
            if(numbers[i] == taken){
                count = count +1;
            }
                }
        System.out.println("Total number of occurances: "+count);

    }
}
