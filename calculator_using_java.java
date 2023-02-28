import java.util.Scanner;

public class calculator_using_java {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("The First Number: ");
        Integer x = Input.nextInt();
        System.out.print("Type the operator: ");
        Character c = Input.next().charAt(0);
        System.out.print("Enter the second integer: ");
        Integer y = Input.nextInt();
        if(c.equals('+')){
            System.out.print("Your calculated value: ");
            System.out.println(x+y);
        }
        else if(c.equals('-')){
            System.out.print("Your calculated value: ");
            System.out.println(x-y);
        }
        else if(c.equals('*')){
            System.out.print("Your calculated value: ");
            System.out.println(x*y);
        }
        else if(c.equals('/')){
            System.out.print("Your calculated value: ");
            System.out.println(x/y);
        }
    }
    
}
