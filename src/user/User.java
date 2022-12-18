package user;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class User extends userExtended{
    private List<String> userList = new ArrayList<String>();
    private String fullname;
    private String email;

    private String password;
    private String phoneNumber;

    private userEnum role ;

    private departmentEnum department ;

    // yapıcı blok bu bloğa create edilmek istenen user bilgileri yollanıyor .
    public void User(){

        System.out.println("user set fonksiyonu");
        Scanner scanner = new Scanner(System.in);
        System.out.println("FullName: ");
        String fullname = scanner.next();
        setFullName(fullname);
        System.out.println("email: ");
        String email = scanner.next();
        setEmail(email);
        System.out.println("Password: ");
        String password = scanner.next();
        setPassword(password);
        System.out.println("phoneNumber: ");
        String phoneNumber = scanner.next();
        setPhoneNumber(phoneNumber);
        System.out.println("role (ADMIN,\n" +
                "    EMPLOOYE,\n" +
                "    CUSTOMER): ");
        String role = scanner.next();
        setRole(role);
            System.out.println("department (DEVELOPMENT,\n" +
                    "    CRM,\n" +
                    "    SALES,\n" +
                    "    FINANCE): ");
            String department = scanner.next();
            setDepartment(department);


        System.out.println(getUserModel());
        String user = "Full Name:  "+this.fullname+"\nEmail: " + this.email + "\npassword:    " + this.password + "\nphoneNumber:  " + this.phoneNumber+ "\nrole:  " + this.role+ "\ndepartment:  " + this.department;
        setList(user);
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
