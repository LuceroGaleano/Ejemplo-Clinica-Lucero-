
package Class;

import java.util.Date;

public class Policy {
    protected Company company;
    protected String id;
    protected boolean status;
    protected Date vigency;

    public Policy(Company company, String id, boolean status, Date vigency) {
        this.company = company;
        this.id = id;
        this.status = status;
        this.vigency = vigency;
    }
}
