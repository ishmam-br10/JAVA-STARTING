import java.util.Scanner;
public class example_loop_11 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        Integer n = Input.nextInt();
        for(int i = 0; i<=n; i++){
            for(int j = 1; j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    
}
