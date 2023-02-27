import java.util.Scanner;

public class odd_even_number_checker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        Integer x = input.nextInt();
        if (x%2 == 0){
            System.out.println("The number is even!");
        }
        else{
            System.out.println("The number is odd!");
        }


    }
    
}
