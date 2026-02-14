
package Class;

public class ProcOrder extends OrderItem{
    protected String quantity;
    protected String frecuency;
    protected boolean isSpecialist;
    protected Specialist specialist;

    public ProcOrder(String quantity, String frecuency, boolean isSpecialist, Specialist specialist, String orderId, Item item) {
        super(orderId, item);
        this.quantity = quantity;
        this.frecuency = frecuency;
        this.isSpecialist = isSpecialist;
        this.specialist = specialist;
    }

   
}
