import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String username = input.nextLine();
        System.out.println("Hello " + username);
    }
}
