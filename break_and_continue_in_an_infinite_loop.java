import java.util.Scanner;

public class break_and_continue_in_an_infinite_loop {
    public static void main(String[] args) {
        int n;
        while(true){
            Scanner Input = new Scanner(System.in);
            System.out.print("Enter a number between 1 & 10: ");
            n = Input.nextInt();
            if(n<1 || n>10){
                continue;
            }
            System.out.println("The number multiplied by 3 is = "+ n*3);
            break;
        }
    }
    
}
