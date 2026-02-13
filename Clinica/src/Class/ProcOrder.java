
package Class;

public class ProcOrder extends OrderItem{
    protected Item item;
    protected String quantity;
    protected String frecuency;
    protected boolean isSpecialist;
    protected Specialist specialist;

    public ProcOrder(Item item, String quantity, String frecuency, boolean isSpecialist, Specialist specialist, String orderId, String ItemNumber, ItemType type) {
        super(orderId, ItemNumber, type);
        this.item = item;
        this.quantity = quantity;
        this.frecuency = frecuency;
        this.isSpecialist = isSpecialist;
        this.specialist = specialist;
    }
}
