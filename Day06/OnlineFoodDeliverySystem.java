// definition of Discountable interface
interface Discountable {
    float applyDiscount();
    void getDiscountDetails();
}

// definition of FoodItem class which implements Discountable interface
abstract class FoodItem implements Discountable {
    // declaring the attributes of this class
    protected String itemName;
    protected float price;
    protected int quantity;

    // defining the behaviour of this class :-

    // created an abstract method calculateTotalPrice()
    protected abstract float calculateTotalPrice();

    // created an abstract method set() to set the attributes in child classes without any ambiguity
    abstract public void set(String itemName, float price, int quantity);

    // created a concrete method getItemDetails()
    protected void getItemDetails() {
        System.out.println("this is a FoodItem.");
    }

    // providing definition of methods from Discountable interface
    @Override
    public float applyDiscount() {
        return (this instanceof VegItem)? 10 : 15;
    }

    @Override
    public void getDiscountDetails() {
        System.out.println("This item is applicable to get " + applyDiscount() + "% discount.");
    }
}

// definition of VegItem class
class VegItem extends FoodItem {

    // overriding setter method of FoodItem class
    @Override
    public void set(String itemName, float price, int quantity) {
        this. price =  price;
        this.itemName = itemName;
        this. quantity =  quantity;
    }

    // creating getter methods
    public float getPrice() {
        return this.price;
    }

    public String getItemName() {
        return this.itemName;
    }

    public int getQuantity() {
        return this.quantity;
    }

    // overriding the abstract method of FoodItem class
    @Override
    protected float calculateTotalPrice() {
        float priceOnQuantity = price * quantity;

        // subtracting discount from price and there is no tax on VegItem
        float actualPrice = priceOnQuantity - (priceOnQuantity * applyDiscount() / 100);
        return actualPrice;
    }

    // overriding the getItemDetails method of FoodItem class
    @Override
    public void getItemDetails() {
        System.out.println("Name of this item: " + this.getItemName() + "\nPrice: " + this.getPrice() + "\nQuantity: " + this.getQuantity() + "\nPrice with adding taxed and reducing discount: " + this.calculateTotalPrice());
    }
}

// definition of NonVegItem class
class NonVegItem extends FoodItem {
    // defining the behaviour of this class :-
    float tax = 12;

    // overriding setter method of FoodItem class
    @Override
    public void set(String itemName, float price, int quantity) {
        this. price =  price;
        this.itemName = itemName;
        this. quantity =  quantity;
    }

    // creating getter methods
    public float getPrice() {
        return this.price;
    }

    public String getItemName() {
        return this.itemName;
    }

    public int getQuantity() {
        return this.quantity;
    }

    // overriding the abstract method of FoodItem class
    @Override
    protected float calculateTotalPrice() {
        float priceOnQuantity = price * quantity;

        // adding tax and subtracting discount from price
        float actualPrice = priceOnQuantity + (priceOnQuantity * tax / 100) - (priceOnQuantity * applyDiscount() / 100);
        return actualPrice;
    }

    // overriding the getItemDetails method of FoodItem class
    @Override
    public void getItemDetails() {
        System.out.println("Name of this item: " + this.getItemName() + "\nPrice: " + this.getPrice() + "\nQuantity: " + this.getQuantity() + "\nPrice with adding taxed and reducing discount: " + this.calculateTotalPrice());
    }
}

// definition of OnlineFoodDeliverySystem class
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        // created an array of references of FoodItem class
        FoodItem [] FoodItems = new FoodItem[2];

        // iterating through a for loop to get input for the FoodItems
        for (int i = 0; i < 2; i++) {
            // created variables for providing attributes values
            String itemName = "Item-" + (i+1);
            float price = (i==0)? 250 : 500;
            int quantity = (i==0)? 5 : 10;

            // initializing objects
            FoodItems[i] = ( i == 0)? new VegItem() : new NonVegItem();

            // setting attribute values
            FoodItems[i].set(itemName,  price,  quantity);
            // getting the details of FoodItem
            FoodItems[i].getItemDetails();
        }
    }
}