import java.util.Scanner;

public class do_while_loop {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int n;
        do{
            System.out.print("Enter a number between 1 & 10: ");
            n = Input.nextInt();
        }while(1 >= n || n >= 10);
        System.out.println(n + " is in between 1 & 10. Programme executed");
    }
    
}
