import java.util.*;

public class SpecialVendingMachine extends VendingMachine{
    private Map<String, List<String>> specialItems = new HashMap<>();

     @Override
    public void addItem(String name, double price, int quantity) {
        inventory.put(name, new Slot(new Item(name, price), quantity));
    }

    public void addSpecial(String name, String specialMessage){
        if(specialItems.containsKey(name)){
            specialItems.get(name).add(specialMessage);
        }
        else{
            List<String> messagesList = new ArrayList<>();
            messagesList.add(specialMessage);
            specialItems.put(name, messagesList);
        }
    }

    public void displaySpecial(){
        for(String name : specialItems.keySet()){
            List<String> messagesList = specialItems.get(name);
            System.out.println(messagesList);
        }
    }

    public void vendSpecial(String name){
        Slot slot = inventory.get(name);
        if(slot != null && slot.quantity>0){
            if(moneyInserted >= slot.item.price){
                System.out.println("Vending: " + name);
                
            }
        }
    }
}
