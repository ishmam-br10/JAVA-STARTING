import java.util.Arrays;
import java.util.Scanner;
public class array_example_4 {
    public static void main(String[] args) {
        // int[] numbers = {3,6,3,1,10,34,0};
        // checker(numbers);
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
        checker(numbers);
    }
    public static void checker(int[] numbers) {
        int max = numbers[0];
        int min = numbers[0];
        for(int i=0; i< numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
            if(numbers[i] < min){
                min =  numbers[i];
            }

        }
        System.out.println("Max number in the array: "+ max);
        System.out.println("Minimum number in the array: "+min);
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
