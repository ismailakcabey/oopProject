import user.User;
import user.userLogin;

import java.util.Scanner;
 public class Main {
public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        User objUser = new User();
        userLogin userLoginObj = new userLogin();
        objUser.userExtended();
        System.out.println("User bilginiz mevcut mu ? (true/false)");
        boolean isUser = scanner.nextBoolean();

        if(isUser){
            Boolean isVerify = userLoginObj.userLogin(objUser.getEmail() , objUser.getPassword());
            System.out.println("user bilgisi : "+isVerify);
            if(!isVerify){
                objUser.User();
                System.out.println("------- user bilgileri setlenen ---------");
                isVerify = userLoginObj.userLogin(objUser.getEmail() , objUser.getPassword());
                System.out.println("user bilgisi : "+isVerify);
            }
        }
        else{
            objUser.User();
        }


    }
}