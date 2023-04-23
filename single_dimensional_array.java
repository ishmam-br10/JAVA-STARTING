public class single_dimensional_array {
    public static void main(String[] args) {
        int[] mew = new int[5];
        mew[0] = 5;
        mew[2] = 8;
        mew[4] = 10;
        // array initializers
        int[] numbers = {10, 5, 9, 4, 5, 6};
        // System.out.println(numbers);
        // System.out.println(mew);
        for(int i=0; i < numbers.length; i++){
            System.out.print(numbers[i]);
        }
        }
}
