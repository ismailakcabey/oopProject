package user;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    private List<String> userList = new ArrayList<String>();
    private String fullname;
    private String email;

    private String password;
    private String phoneNumber;

    private userEnum role ;

    private departmentEnum department ;

    // yapıcı blok bu bloğa create edilmek istenen user bilgileri yollanıyor .
    public void User(String fullname, String email, String password, String phoneNumber , String role , String department){
        System.out.println("user set fonksiyonu");
        setFullName(fullname);
        setEmail(email);
        setPassword(password);
        setPhoneNumber(phoneNumber);
        setRole(role);
        setRole(department);
        System.out.println(getUserModel());
        String user = "Full Name:  "+this.fullname+"\nEmail: " + this.email + "\npassword:    " + this.password + "\nphoneNumber:  " + this.phoneNumber+ "\nrole:  " + this.role+ "\ndepartment:  " + this.department;
        setList(user);
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public void setDepartment(String department) {

        this.email = email;
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
