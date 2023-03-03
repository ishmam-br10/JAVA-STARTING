import java.util.Scanner;

public class loop_practise_6 {
    // TASK: 
    // DESIGN A CODE TO ADD ALL THE DIGITS OF A NUMBER AND SHOW THE SUMMATION.
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = Input.nextLine();
        int sum = 0;
        for(int i = 0; i < num.length(); i++){
            Character mew = num.charAt(i);// iterete through a string
            // System.out.println(mew);
            int mew1 = mew - '0'; // convert a char to a integer
            // System.out.println(mew1);
            sum = sum + mew1;
        }
        System.out.println("Summation is: "+sum);
    }
    
}
