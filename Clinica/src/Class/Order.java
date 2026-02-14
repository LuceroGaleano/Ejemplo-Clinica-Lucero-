
package Class;

import java.time.LocalDate;
import java.util.ArrayList;

public class Order {
    protected String id;
    protected Patient patient;
    protected User doctor;
    protected LocalDate date;
    protected ArrayList<OrderItem> orderItem;

    public Order(String id, Patient patient, User doctor, LocalDate date, ArrayList<OrderItem> orderItems) {
        this.id = id;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.orderItem = orderItems;
    }
    
    public String getInfo(){
        String info = "\n//--Order--//" +
                  "\nPatient: " + this.patient.showInfo() +
                  "\nDoctor: " + this.doctor.showInfo() +
                  "\nItems:";
        for(OrderItem item:this.orderItem){
            info += item.getItem().getInfo();
        }
        
        return info;
    }
    
}
