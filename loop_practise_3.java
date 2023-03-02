import java.util.Scanner;

public class loop_practise_3 {
    public static void main(String[] args) {
        int summ = 0;
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int x = Input.nextInt();
        System.out.print("The strict divisors are: ");
        for(int i=1;i<x; i++){
            if(x%i == 0){
                summ =summ+ i;
                System.out.print(i + " ");
            }

        }
        System.out.println(" ");
        System.out.print("The summation is: "+ summ);
        System.out.println(" ");

    }
    
}
