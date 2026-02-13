
package Class;

import java.util.Date;


public class Invoice {
    protected Patient patient;
    protected User doctor;
    protected Order order;
    protected Date date;
    protected boolean copago;

    public Invoice(Patient patient, User doctor, Order order, Date date, boolean copago) {
        this.patient = patient;
        this.doctor = doctor;
        this.order = order;
        this.date = date;
        this.copago = copago;
    }
}
