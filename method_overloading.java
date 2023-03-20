public class method_overloading {
    public static void main(String[] args) {
        System.out.println("Default method");
        Sayit();
        System.out.println("Not default");
        System.out.println(Sayit("Ishmam"));
    }
    public static void Sayit() {
        System.out.println("Hello world");
    }
    public static String Sayit(String name) {
        return "Hello " + name;
    }
}
