package user;
import java.util.Scanner;
public class userLogin {

    public boolean login(String email , String password){
        System.out.println("LOGIN FONKSIYONU");
        System.out.println("------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("LOGIN OLMAK ICIN EMAIL GIRINIZ : ");
        System.out.println("------------------------");
        String newEmail = scanner.nextLine();
        System.out.println("LOGIN FONKSIYONU PASSWORD : ");
        System.out.println("------------------------");
        String newPassword = scanner.nextLine();
        if (email != null && email.equals(newEmail) && password.equals(newPassword)){
            System.out.println("tebrikler giris yaptiniz !");

            return true;
        }
        else {
            return false;
        }
    }
    public boolean userLogin(String email , String password){


        return login(email,password);
    }
}
