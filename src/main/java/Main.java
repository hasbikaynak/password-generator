import java.util.Scanner;

public class Main {
    public void start(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Password Generator application\n" +
                "Please follow the program`s leading");
        Password password = new Password();
        password.getPassword();
    }
}
