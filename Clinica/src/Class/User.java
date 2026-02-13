
package Class;

import java.util.Date;


public class User extends Person{
    protected String userName;
    protected String password;
    protected Role role;

    public User(String userName, String password, Role role, String name, int document, Date brithdate, String adress, int cellphone, String email) {
        super(name, document, brithdate, adress, cellphone, email);
        this.userName = userName;
        this.password = password;
        this.role = role;
    } 
}
