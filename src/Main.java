import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name, Password, Balance to create an account : ");

        //create user
        String name = sc.nextLine();
        String password = sc.nextLine();
        double balance = sc.nextDouble();


        SBIUser user = new SBIUser(name, balance,password);
        System.out.println(user.getPassword());

        //addMoney
        String msg = user.addMoney( 100000);
        System.out.println(msg);

        System.out.println("Enter amount you want to withdrawal :");
        int amount = sc.nextInt();
        System.out.println("Enter the password : ");
        String pass = sc.nextLine();

        String result = user.withdrawMoney(amount, pass);
        System.out.println(result);
    }
}