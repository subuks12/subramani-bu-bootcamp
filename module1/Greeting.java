import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
         String name = scanner.nextLine();
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter your Job role: ");
        String role = scanner1.nextLine();
        System.out.println("Hello, " + name + "! As a " + role + ", you are in exactly the right place");
        scanner.close();
        scanner1.close();
    }
}
