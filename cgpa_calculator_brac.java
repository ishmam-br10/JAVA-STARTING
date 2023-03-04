import java.util.Scanner;

public class cgpa_calculator_brac {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        Integer Number = Input.nextInt();
        if(Number>100){
            System.out.println("Invalid number");
        }
        else if(100>=Number && Number>=97){
            System.out.println("Grade: A+,  GPA:4.00");

        }
        else if(97>Number && 90<=Number){
            System.out.println("Grade: A,  GPA:4.00");
        }
        else if(85<= Number && 90> Number){
            System.out.println("Grade: A-,  GPA:3.70");
        }
        else if(80<= Number && 85>Number){
            System.out.println("Grade: B+,  GPA:3.30");
        }
        else if(75<= Number && 80> Number){
            System.out.println("Grade: B,  GPA:3.00");
        }
    }
    
}
