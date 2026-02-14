
package Class;

import java.time.LocalDate;


public abstract class Person{
   private String name;
   private String document;
   private LocalDate brithdate;
   private String adress;
   private String cellphone;
   private String email;

    public Person(String name, String document, LocalDate brithdate, String adress, String cellphone, String email) {
        this.name = name;
        this.document = document;
        this.brithdate = brithdate;
        this.adress = adress;
        this.cellphone = cellphone;
        this.email = email;
    }
    
    public String getInfo(){
        return " Name: " + this.name + "\n Documetn: " + this.document  +
                "\n Cellphone: " + this.cellphone + "\n Email: " + this.adress;
    }
}
