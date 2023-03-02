public class loop_practise_1 {
    public static void main(String[] args) {
        // here we are gonna make a program that prints all even and odd between 1&100
        // both in increasing and decreasing order
        // increasing even
        System.out.println("Even numbers in increasing order: ");
        for(int i = 1; i <=50; i++){
            if(i%2 == 0){
                System.out.print(i + " ");
            }
            
        }
        System.out.println(" ");
        System.out.println("Even numbers in decreasing order: ");
        for(int i = 50; i >= 1; i--){
            if(i%2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");

        System.out.println("Odd numbers in increasing order: ");
        for(int i = 1; i <=50; i++){
            if(i%2 != 0){
                System.out.print(i + " ");
            }
            
        }
        System.out.println(" ");
        System.out.println("Odd numbers in decreasing order: ");
        for(int i = 50; i >= 1; i--){
            if(i%2 != 0){
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");

    }
    
}
