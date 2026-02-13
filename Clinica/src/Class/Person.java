
package Class;

import java.util.Date;


public abstract class Person{
   protected String name;
   protected int document;
   protected Date brithdate;
   protected String adress;
   protected int cellphone;
   protected String email;

    public Person(String name, int document, Date brithdate, String adress, int cellphone, String email) {
        this.name = name;
        this.document = document;
        this.brithdate = brithdate;
        this.adress = adress;
        this.cellphone = cellphone;
        this.email = email;
    }
}
