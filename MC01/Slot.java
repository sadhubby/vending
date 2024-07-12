

public class Slot {
    Item item;
    int quantity;
    String name;

    public Slot(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
 
    }

    public Item getItem(){
        return item;
    }

    public int getQuantity(){
        return quantity;
    }

}
