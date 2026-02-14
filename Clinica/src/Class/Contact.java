
package Class;

import java.time.LocalDate;


public class Contact extends Person{
    private String relation;

    public Contact(String relation, String name, String document, LocalDate brithdate, String adress, String cellphone, String email) {
        super(name, document, brithdate, adress, cellphone, email);
        this.relation = relation;
    }
    
    public String getRelation() {
        return relation;
    }
}
