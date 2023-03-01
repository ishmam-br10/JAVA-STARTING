import java.util.Scanner;

public class while_loop_prac1 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter a Integer between 1 and 10: ");
        Integer x = Input.nextInt();
        while(x<1 || x>10){
            System.out.print("Sorry! " + x + " Is not between 1 & 10. Try again: " );
            x = Input.nextInt();
        }
        System.out.println(x + " is between 1 & 10. Thank you! ");
    }
}
