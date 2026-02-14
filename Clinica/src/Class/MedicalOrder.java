
package Class;

public class MedicalOrder extends OrderItem{
    protected String doce;
    protected String duration;

    public MedicalOrder(String doce, String duration, String orderId, Item item) {
        super(orderId, item);
        this.doce = doce;
        this.duration = duration;
    }
}
