import java.util.Scanner;

public class loop_practise8 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = Input.nextLine();
        // String s = "NEW STRING";
        for(int i=0; i< s.length(); i++){
            Character n = s.charAt(i);
            String a=String.valueOf(n);
            System.out.print(a+ ' ');
        }
        System.out.println();
    }
    
}
