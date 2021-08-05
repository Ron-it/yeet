import java.util.Scanner;

public class rwtxt2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String user, password;

        System.out.println("Enter your username: ");
        user = input.nextLine();

        System.out.println("Enter your password");
        password = input.nextLine();

        if (user.equals("Test1") && (password.equals("Test2"))) {
            System.out.println("yes");
        }

        else {
            System.out.println("no");
        }

    }

}
