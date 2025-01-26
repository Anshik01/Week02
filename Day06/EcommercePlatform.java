abstract class Product{
     private int productID;
    private String name;
    private int price;
    private double tax;

    // getter setter method of tax
    void setTax(double tax1){
        this.tax = tax1;
    }
    double getTax(){
        return this.tax;
    }

    // getter setter method of price
    int getPrice(){
        return this.price;
    }
    void setPrice(int price1){
        this.price = price1;
    }

    Product(int productID, String name, int price){
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    abstract int calculateDiscount();

    void displayDetails(){
        System.out.println("Product Id : " + productID);
        System.out.println("Name : " + name);
        System.out.println("Price : " + price);
    }

}

// defining interface taxable
interface Taxable{

    // defining abstract methods of interface
    void calculateTax();
    void getTaxDetail();
}

//defining subclasses Electronics, Clothing, and Groceries.
class Electronics extends Product implements Taxable{

    Electronics(int productID, String name, int price){
        super(productID, name, price);
        calculateTax();
    }
    @Override
    int calculateDiscount() {
        // discount will be 10% of price
        return getPrice()/10;
    }

    @Override
    public void calculateTax() {
        double set = (30.0/100.0) * (double) getPrice();
        setTax(set);
    }

    @Override
    public void getTaxDetail() {
        System.out.println("Imposed Tax : " + (getTax()));
        System.out.println("Price after imposing tax : " + (getPrice() + getTax()));
    }

    @Override
    void displayDetails(){
        super.displayDetails();
        getTaxDetail();
        System.out.println("Total price : " + (getPrice() - calculateDiscount() + getTax()));
    }
}

class Clothing extends Product implements Taxable{

    Clothing(int productID, String name, int price){
        super(productID, name, price);
        calculateTax();
    }

    @Override
    int calculateDiscount() {
        // discount will be 10% of price
        return getPrice()/10;
    }

    @Override
    public void calculateTax() {
        double set = (double)getPrice() / 10.0;
        setTax(set);
    }

    @Override
    public void getTaxDetail() {
        System.out.println("Imposed Tax : " + getTax());
        System.out.println("Price after imposing tax : " + (getPrice() + getTax()));
    }

    @Override
    void displayDetails(){
        super.displayDetails();
        getTaxDetail();
        System.out.println("Total price : " + (getPrice() - calculateDiscount() + getTax()));
    }
}

class Groceries extends Product implements Taxable{

    Groceries(int productID, String name, int price){
        super(productID, name, price);
        calculateTax();
    }

    @Override
    int calculateDiscount() {
        // discount will be 10% of price
        return getPrice()/10;
    }

    @Override
    public void calculateTax() {
        double set = 0.0;  // no tax on Groceries
        setTax(set);
    }

    @Override
    public void getTaxDetail() {
        System.out.println("Imposed Tax : " + getTax());
        System.out.println("No tax on Groceries");
    }

    @Override
    void displayDetails(){
        super.displayDetails();
        getTaxDetail();
        System.out.println("Total price : " + (getPrice() - calculateDiscount() + getTax()));
    }
}
public class EcommercePlatform {
    public static void main(String[] args) {
        // creating object of electronics
        Electronics electronics = new Electronics(101, "AC", 20000);
        // creating object of clothing
        Clothing clothing = new Clothing(102, "Pant", 1000);
        // creating object of groceries
        Groceries groceries = new Groceries(103, "Wheat flour", 150);

        electronics.displayDetails();
        System.out.println();
        clothing.displayDetails();
        System.out.println();
        groceries.displayDetails();
        System.out.println();
    }
}
