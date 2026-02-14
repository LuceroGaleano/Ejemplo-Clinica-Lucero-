
package Class;

public abstract  class OrderItem {
    protected String orderId;
    protected Item item;

    public OrderItem(String orderId, Item item) {
        this.orderId = orderId;
        this.item = item;
    }
    
    public Item getItem(){
        return this.item;
    }
}
