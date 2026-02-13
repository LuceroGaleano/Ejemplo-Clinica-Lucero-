
package Class;

import java.util.Date;

public class Patient extends Person{
    protected Gender gender;
    protected Contact contact;
    protected Policy policy;

    public Patient(Gender gender, Contact contact, Policy policy, String name, int document, Date brithdate, String adress, int cellphone, String email) {
        super(name, document, brithdate, adress, cellphone, email);
        this.gender = gender;
        this.contact = contact;
        this.policy = policy;
    }
    
    
}
