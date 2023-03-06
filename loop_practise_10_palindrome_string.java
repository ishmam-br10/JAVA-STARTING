import java.util.Scanner;

public class loop_practise_10_palindrome_string {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = Input.nextLine();
        Integer j = str.length()-1;
        boolean flag = true;
        for(int i = 0; i<j; i++){
            if(str.charAt(i) == str.charAt(j)){
                flag = true;
                j--;
            }
            else{
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Palindorme!");
        }
        else{
            System.out.println("Is not palindrome!");
        }
    }    
}
