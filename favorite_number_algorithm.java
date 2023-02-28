import java.util.Scanner;

public class favorite_number_algorithm {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the 4 digit number: ");
        Integer x = Input.nextInt();
        Integer d = x % 10;
        Integer c = (x/10) % 10;
        Integer b = (x/100) % 10;
        Integer a = (x/1000) % 10;
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);
        // System.out.println(d);
        if (a+b == c+d){
            System.out.println("It is a lucky number !");
        }
        else{
            System.out.println("Not a lucky number! ");
        }
    }
    
}
