import java.util.Scanner;

public class method_class_2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the start point: ");
        Integer s = Input.nextInt();
        System.out.print("Enter the end integer: ");
        Integer e = Input.nextInt();
        System.out.println("The prime numbers are: ");
        PrintPrimeNumber(s, e);
        System.out.println();
    }
    public static boolean IsPrime(int x) {
        boolean a = true;
        for(int k=2; k<x; k++){
            if(x%k != 0){
                a = true;
            }
            else{
                a = false;
                break;
            }
        }
        return a;
    }
    public static void PrintPrimeNumber(int start, int end) {
        for(int i=start; i<= end; i++){
            if(IsPrime(i)){
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }
}
