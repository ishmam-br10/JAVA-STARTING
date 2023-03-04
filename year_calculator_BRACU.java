import java.util.Scanner;

public class year_calculator_BRACU {
    public static void main(String[] args) {
        System.out.println("YEAR CALCULATOR BRAC University");
        System.out.print("Enter your credit: ");
        Scanner Input = new Scanner(System.in);
        Integer credit = Input.nextInt();
        if(0<=credit && 30>=credit){
            System.out.println("Freshman Year!");
        }
        else if(31<= credit && 60>= credit){
            System.out.println("Sophmore Year!");
        }
        else if(61<= credit && 90>=credit){
            System.out.println("Junior Year!");
        }
        else if(91<= credit && 140>= credit){
            System.out.println("Senior Year!");

        }
        else if(credit> 140){
            System.out.println("Advanced Senior!");
        }

    }
    
}
