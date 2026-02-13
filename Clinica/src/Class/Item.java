
package Class;


public class Item {
    protected String id;
    protected String name;
    protected double cost;
    protected ItemType type;

    public Item(String id, String name, double cost, ItemType type) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.type = type;
    }
}
