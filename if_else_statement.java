import java.util.Scanner;

public class if_else_statement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        Integer x = input.nextInt();
        System.out.print("Enter the second integer: ");
        Integer y = input.nextInt();
        if(x>y){
            System.out.println("Number 1 is greater!");
        }
        if (x<y){
            System.out.println("Number 2 is greater");
        }
        else{
            System.out.println("Both are equal");
        }


    }
    
}
