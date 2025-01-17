import java.util.Scanner;
import java.util.ArrayList;
class Item{
    // declare variable
    String itemName;
    int price;
    int quantity;

    // making cost static
    static int cost = 0;

    // making constructor where we update the value of cost
    public Item(String itemName, int price, int quantity){
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        // increase the cost
        cost += (price * quantity);
    }

    public String getName(){
        return itemName;
    }

    public void displayItem(){
        System.out.println("Item : " + itemName + " price : " + price + " quantity : " + quantity);
    }
}

class ShopCart{
    ArrayList<Item>cart;
    public ShopCart(){
        cart = new ArrayList<>();
    }

    public void addItem(String itemName, int price, int quantity){
        cart.add(new Item(itemName, price, quantity));
        System.out.println("Item is added in a cart");
    }

    public void removeItem(String itemName){
        for(int i=0; i<cart.size(); i++){
            if(cart.get(i).getName().equalsIgnoreCase(itemName)){
                cart.remove(i);
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public void displayCart(){
        if(cart.isEmpty()){
            System.out.println("Cart is empty");
            return;
        }
        for(Item item : cart){
            item.displayItem();
        }
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ShopCart shopCart = new ShopCart();

        boolean exit = false;

        while(exit == false){
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Display total cost");
            System.out.println("4. Display Cart");

            int operation = sc.nextInt();

            if(operation == 1){
                // input data
                System.out.println("Enter product detail");
                String itemName = sc.next();
                int price = sc.nextInt();
                int quantity = sc.nextInt();

                shopCart.addItem(itemName, price, quantity);
            }
            else if(operation == 2){
                System.out.println("Enter item you wish to remove");
                String itemName = sc.next();
                shopCart.removeItem(itemName);
            }
            else if(operation == 3){
                System.out.println("Total cost is : " + Item.cost);
            }
            // user choose display cart
            else if(operation == 4){
                shopCart.displayCart();
            }
            // user choose invalid operation
            else{
                System.out.println("Invalid operation");
            }
            System.out.println("Want to exit? ");
            exit = sc.nextBoolean();
        }

    }
}