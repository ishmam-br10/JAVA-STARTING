import java.util.Arrays;
import java.util.Scanner;

public class array_exercise_1 {
    // https://shorturl.at/jyH27 [video link]
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("How many elements? (max 20): ");
        int n = Input.nextInt();
        while(n>20 || n<=0){
            System.out.print("Invalid number, try again: ");
            n = Input.nextInt();
        }
        int[] numbers = new int[n];
        fillArrayofIntegers(numbers);
        printArrayOfIntegers(numbers);
    }
    public static void printArrayOfIntegers(int[] numbers) {
        System.out.print("The elements are: ");
        System.out.println(Arrays.toString(numbers));
    }
    public static void fillArrayofIntegers(int[] numbers) {
        Scanner Input = new Scanner(System.in);
        for(int i = 0; i<numbers.length; i++){
            numbers[i] = Input.nextInt();
        }
    }
}
