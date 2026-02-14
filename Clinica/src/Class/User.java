
package Class;

import java.time.LocalDate;


public class User extends Person{
    protected String userName;
    protected String password;
    protected Role role;

    public User(String userName, String password, Role role, String name, String document, LocalDate brithdate, String adress, String cellphone, String email) {
        super(name, document, brithdate, adress, cellphone, email);
        this.userName = userName;
        this.password = password;
        this.role = role;
    } 
    
    public String showInfo(){
        String info = "\n//--User Created--//\n" + this.getInfo() +
                "\n User Name: " + this.userName +
                "\n Role: " + this.role; 
        return info;
    }
}
