
package Class;


public class supOrder extends OrderItem{
    protected Item item;
    protected String quantity;
    protected boolean isSpecialist;
    protected Specialist spcialist;

    public supOrder(Item item, String quantity, boolean isSpecialist, Specialist spcialist, String orderId, String ItemNumber, ItemType type) {
        super(orderId, ItemNumber, type);
        this.item = item;
        this.quantity = quantity;
        this.isSpecialist = isSpecialist;
        this.spcialist = spcialist;
    }
    
    
}
