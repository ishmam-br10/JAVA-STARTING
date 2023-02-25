import java.util.Scanner;

public class scan_and_print_your_name {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        System.out.println("Your name is:"+ inp.nextLine());
    }
}
