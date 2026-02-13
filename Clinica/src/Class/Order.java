
package Class;

import java.util.ArrayList;
import java.util.Date;

public class Order {
    protected String id;
    protected Patient patient;
    protected User doctor;
    protected Date date;
    protected ArrayList<OrderItem> orderItem;

    public Order(String id, Patient patient, User doctor, Date date, OrderItem orderItem) {
        this.id = id;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.orderItem.add(orderItem);
    }
    
    
}
