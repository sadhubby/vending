

public class RegularVendingMachine extends VendingMachine {
    @Override
    public void addItem(String name, double price, int quantity) {
        inventory.put(name, new Slot(new Item(name, price), quantity));
    }

    public void restock(String name, int quantity) {
        Slot slot = inventory.get(name);
        if (slot != null) {
            slot.quantity += quantity;
            System.out.println("Restocked " + name + ", new quantity: " + slot.quantity);
        } else {
            System.out.println("Item not found for restock: " + name);
        }
   }
}