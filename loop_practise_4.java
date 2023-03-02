import java.util.Scanner;

public class loop_practise_4 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int mew = Input.nextInt();
        boolean flag = true;
        for(int i=2; i< mew; i++){
            if(mew % i == 0){
                System.out.println("The number is not prime! Divided by " + i);
                flag = false;
                break;
            }
        
        }
        if(flag){
            System.out.println("The number is PRIME! ");
        }

    }
}
