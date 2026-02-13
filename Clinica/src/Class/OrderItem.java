
package Class;

public abstract  class OrderItem {
    protected String orderId;
    protected String ItemNumber;
    protected ItemType type;

    public OrderItem(String orderId, String ItemNumber, ItemType type) {
        this.orderId = orderId;
        this.ItemNumber = ItemNumber;
        this.type = type;
    } 
}
