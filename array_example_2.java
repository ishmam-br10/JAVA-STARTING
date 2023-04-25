public class array_exe_2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, -3, 5, 7};
        int sum = 0;
        int product = 1;
        double average;
        for(int i= 0; i< numbers.length; i++){
            sum = sum + numbers[i];
            product = product * numbers[i];
        }
        average = sum / numbers.length ;
        // printing out
        System.out.println("Average of the array: " + average);
        System.out.println("Summation of the array: "+ sum);
        System.out.println("Product of the array: "+ product);
    }
}
