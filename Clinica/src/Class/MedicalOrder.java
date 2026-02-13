
package Class;

public class MedicalOrder extends OrderItem{
    protected String doce;
    protected String duration;
    protected Item item;

    public MedicalOrder(String doce, String duration, Item item, String orderId, String ItemNumber, ItemType type) {
        super(orderId, ItemNumber, type);
        this.doce = doce;
        this.duration = duration;
        this.item = item;
    }
    
    
}
