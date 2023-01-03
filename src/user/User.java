package user;
import com.sun.tools.javac.Main;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class User extends foreignCurrency {
    private List<String> userList = new ArrayList<String>();
    private String fullname;
    private String email;

    private String password;
    private String phoneNumber;

    private userEnum role ;

    private departmentEnum department ;

    // yapıcı blok bu bloğa create edilmek istenen user bilgileri yollanıyor .
    public void User(){

        System.out.println("USER CREATE FONKSIYONU");
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------");
        System.out.println("FullName: ");
        String fullname = scanner.next();
        setFullName(fullname);
        System.out.println("---------------");
        System.out.println("email: ");
        String email = scanner.next();
        setEmail(email);
        System.out.println("---------------");
        System.out.println("Password: ");
        String password = scanner.next();
        setPassword(password);
        System.out.println("---------------");
        System.out.println("phoneNumber: ");
        String phoneNumber = scanner.next();
        setPhoneNumber(phoneNumber);
        System.out.println("---------------");
        boolean kontrol = true;
        while (kontrol) {
            try {
                System.out.println("role (ADMIN,\n" +
                        "    EMPLOOYE,\n" +
                        "    CUSTOMER: ");
                String role = scanner.next();
                setRole(role);
                kontrol = false;
            } catch (Exception exception) {
                System.out.println("Hatalı yanıt girdiniz.");
                System.out.println("Lütfen tekrar deneyin.");
            }
        }

        System.out.println("---------------");
        boolean kontrol1 = true;
        while (kontrol1) {
            try {
                System.out.println("department (DEVELOPMENT,\n" +
                        "    CRM,\n" +
                        "    SALES,\n" +
                        "    FINANCE: ");
                String department = scanner.next();
                setDepartment(department);
                kontrol1=false;
            } catch (Exception exception) {
                System.out.println("Hatalı yanıt girdiniz.");
                System.out.println("Lütfen tekrar deneyin.");
            }
        }
        System.out.println("---------------");
        System.out.println(getUserModel());
        String user = "Full Name:  "+this.fullname+"\nEmail: " + this.email + "\npassword:    " + this.password + "\nphoneNumber:  " + this.phoneNumber+ "\nrole:  " + this.role+ "\ndepartment:  " + this.department;
        System.out.println("---------------");
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getEmail() {

        return  this.email;
    }
    public String getPassword() {
        return  this.password;
    }
    public String getFullname() {
        return  this.fullname;
    }
    public String getPhoneNumber() {
        return  this.phoneNumber;
    }
    public departmentEnum getDepartment() {
        return  this.department;
    }
    public userEnum getRole() {
        return  this.role;
    }



    public void setList(String user) {

        this.userList.add(user);
    }

    public void setFullName(String fullname)
    {

        this.fullname = fullname;
    }


    public void setRole(String role)
    {

        this.role = userEnum.valueOf(role);
    }

    public void setDepartment(String department)
    {

        this.department = departmentEnum.valueOf(department);
    }

    public void setPassword(String password)
    {

        this.password = password;
    }
    public void setPhoneNumber(String phoneNumber)
    {

        this.phoneNumber = phoneNumber;
    }


    public String getUserModel(){
        System.out.println("get fonksiyonu");
        return "Full Name:  "+this.fullname+"\nEmail: " + this.email + "\npassword:    " + this.password + "\nphoneNumber:  " + this.phoneNumber+ "\nrole:  " + this.role+ "\ndepartment:  " + this.department;
    }

    // bu fonksiyon create edilen userlar çekilmek istenildiğinde çağırılıyor .
    public List getUserList(){
        return this.userList;
    }
}
