import java.util.Scanner;

class Inventory{
    int itemCode;
    String itemName;
    int price;

    // Constructor to initialize attributes
    public Inventory(int itemCode, String itemName, int price){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to print Inventory details
    public void printInventory(){
        System.out.println("Item code : " + itemCode);
        System.out.println("Item name : " + itemName);
        System.out.println("Price : " + price);
    }

    public int findCost(int quantity){
        return quantity * price;
    }
}

public class TrackInventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input data
        int itemCode = sc.nextInt();
        String itemName = sc.next();
        int price = sc.nextInt();
        int quantity = sc.nextInt();

        // initializing an object
        Inventory inventory = new Inventory(itemCode, itemName, price);
        int cost = inventory.findCost(quantity);

        // calling print method from Inventory class
        inventory.printInventory();
        System.out.println("Total cost : " + cost);
    }
}
