import java.util.Scanner;

public class name_and_age_java {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter your name and age: ");
        String Name = Input.nextLine();
        double Age = Input.nextDouble();
        System.out.println(Name + " !you are "+ Age + " years old");
    }
    
}
