
package Class;

import java.time.LocalDate;

public class Invoice {
    protected Patient patient;
    protected User doctor;
    protected Order order;
    protected LocalDate date;
    protected boolean copago;

    public Invoice(Patient patient, User doctor, Order order, LocalDate date, boolean copago) {
        this.patient = patient;
        this.doctor = doctor;
        this.order = order;
        this.date = date;
        this.copago = copago;
    }
}
