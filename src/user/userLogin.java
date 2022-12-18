package user;
import java.util.Scanner;
public class userLogin {

    public boolean login(String email , String password){
        System.out.println("LOGIN FONKSIYONU");
        Scanner scanner = new Scanner(System.in);
        System.out.println("LOGIN FONKSIYONU EMAIL : ");
        String newEmail = scanner.nextLine();
        System.out.println("LOGIN FONKSIYONU PASSWORD : ");
        String newPassword = scanner.nextLine();
        System.out.println("girilen : " + newEmail + "\nolmasi gereken : "+email);
        System.out.println("girilen : " + newPassword + "\nolmasi gereken : "+password);
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
