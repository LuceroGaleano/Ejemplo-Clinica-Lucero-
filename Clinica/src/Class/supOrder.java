
package Class;


public class SupOrder extends OrderItem{
    protected String quantity;
    protected boolean isSpecialist;
    protected Specialist spcialist;

    public SupOrder(String quantity, boolean isSpecialist, Specialist spcialist, String orderId, Item item) {
        super(orderId, item);
        this.quantity = quantity;
        this.isSpecialist = isSpecialist;
        this.spcialist = spcialist;
    }

    
}
