
package Class;

import java.time.LocalDate;

public class Patient extends Person{
    protected Gender gender;
    protected Contact contact;
    protected Policy policy;

    public Patient(Gender gender, Contact contact, Policy policy, String name, String document, LocalDate brithdate, String adress, String cellphone, String email) {
        super(name, document, brithdate, adress, cellphone, email);
        this.gender = gender;
        this.contact = contact;
        this.policy = policy;
    }
    
    public String showInfo(){
        String info = "\n//--Patient Created--//\n"  + this.getInfo() +
                "\n Gender: " + this.gender +
                "\n Policy: " + this.policy.getInfo() +
                "\n//--Patient Emergency Conctact//--" +
                "\n" + this.contact.getInfo() +
                "\n Relation: " + this.contact.getRelation();
        return info;
    }
    
}
