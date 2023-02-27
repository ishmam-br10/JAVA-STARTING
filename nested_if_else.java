import java.util.Scanner;

public class nested_if_else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        Integer x = input.nextInt();
        if(x>100){
            if(x%2 == 0){
                System.out.println("The number is greater than 100 & is an even number");
            }
            else{
                System.out.println("The number is greater than 100 & is an odd number");
            }
        }
        if(x == 100){
            if(x%2 == 0){
                System.out.println("The number is equal to 100 & is an even number");
            }
            else{
                System.out.println("The number is equal to 100 & is an odd number");
            }
    
        }
        else{
            if(x%2 == 0){
                System.out.println("The number is less than 100 & is an even number");
            }
            else{
                System.out.println("The number is less than 100 & is an odd number");
            }
        }

    }
    
}
