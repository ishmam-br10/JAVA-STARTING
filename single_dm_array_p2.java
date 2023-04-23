public class single_dm_array_p2 {
    // https://www.youtube.com/watch?v=LDxIl9La5nk&list=PLBlnK6fEyqRjKA_NuK9mHmlk0dZzuP1P5&index=87
    public static void main(String[] args) {
        //passing arrays to methdod
        int[] numbers = {0,1};
        change(numbers);
        printArray(numbers);
        System.out.println(" ");
    }
    // method of changing the array
    public static void change(int[] numbers) {
        numbers[0] = 1;
        numbers[1] = 2;
    }
    // method of printing the array
    public static void printArray(int[] numbers) {
        for(int i=0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
