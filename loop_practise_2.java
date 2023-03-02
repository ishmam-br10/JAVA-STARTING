import java.util.Scanner;

public class loop_practise_2 {
    public static void main(String[] args) {
        int sum = 0;
        while(true){
            Scanner Input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = Input.nextInt();
            sum = sum + n;
            if(sum>=100){
                System.out.println("Done! "+sum);
                break;
            }
        }
    }
    
}
