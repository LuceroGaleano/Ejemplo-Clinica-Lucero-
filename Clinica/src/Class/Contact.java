
package Class;

import java.util.Date;


public class Contact extends Person{
    protected String relation;

    public Contact(String relation, String name, int document, Date brithdate, String adress, int cellphone, String email) {
        super(name, document, brithdate, adress, cellphone, email);
        this.relation = relation;
    }
}
