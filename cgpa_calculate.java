import java.util.Scanner;

public class cgpa_calculate {
    public static void main(String[] args) {
        System.out.print("How many courses have you taken? ");
        Scanner Input = new Scanner(System.in);
        Integer course = Input.nextInt();
        System.out.print("Current semester name: ");
        Scanner Input1 = new Scanner(System.in);
        String semester = Input1.nextLine();
        double summation = 0.0;
        System.out.println();
        for(int i=1; i<=course; i++){
            System.out.print("Your GPA for course " + i + ": ");
            Scanner input = new Scanner(System.in);
            double gpa = input.nextDouble();
            summation = summation + gpa;

        }
        System.out.print("Your CGPA for "+semester+ " is : "+ summation/course);
        System.out.println();
    }
    
}
