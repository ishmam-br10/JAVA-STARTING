import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        System.out.println("Hello World");
        SayTheTruth();
        System.out.println("Bye World");
    }
    public static void SayTheTruth() {
        System.out.print("Say a truth: ");
        Scanner Input = new Scanner(System.in);
        String message = Input.nextLine();
        System.out.print("The truth is: ");
        System.out.print(message);
        System.out.println();
    }
}
