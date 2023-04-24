public class variable_length_argument_list{
    // https://shorturl.at/CDSUY [video link]
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4));
    }
    // only one variable length para can be specified in a method
    
    public static int sum(int... numbers) {
        int sum = 0;
        for(int i = 0; i< numbers.length; i++){
            sum += numbers[i];
        }
        return sum;
    }
}
