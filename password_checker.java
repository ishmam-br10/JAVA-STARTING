import java.util.Scanner;

public class password_checker {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Change your password.");
        System.out.print("Enter your password: ");
        String x = Input.nextLine();
        System.out.print("Re type your password: ");
        String y = Input.nextLine();
        if(x.equals(y)){ // use x.intern() = y.intern()
            System.out.println("Your password has been changed");
        }
        else{
            System.out.println("Wrong passsword");
        }
        
    }
    
}
