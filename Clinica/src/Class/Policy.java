
package Class;

import java.time.LocalDate;

public class Policy {
    protected Company company;
    protected String id;
    protected boolean status;
    protected LocalDate vigency;

    public Policy(Company company, String id, boolean status, LocalDate vigency) {
        this.company = company;
        this.id = id;
        this.status = status;
        this.vigency = vigency;
    }
    
    public String getInfo(){
        return this.company.name;
    }
}
