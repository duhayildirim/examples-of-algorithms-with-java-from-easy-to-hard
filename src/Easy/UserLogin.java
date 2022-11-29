package Easy;
import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);

        System.out.print("Username : ");
        userName = input.nextLine();

        System.out.print("Password : ");
        password = input.nextLine();

        if(userName.equals("duhayildirim") && password.equals("123456")) {
            System.out.println("Login successful");
        } else {
            System.out.println("Failed");
        }
    }
}
