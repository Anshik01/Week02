import java.util.Scanner;

class Product{
    static int discount;
    String productName;
    int price;
    int quantity;
    final int productId; // productId is unique

    public Product(String productName, int price, int quantity, int productId){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productId = productId;
    }


    static void updateDiscount(int updatedDiscount){
        discount = updatedDiscount;
    }

    public void displayDetails(){
        System.out.println("Product name : " + productName);
        System.out.println("Product Price : " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Product Id : " + productId);
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input data
        String productName = sc.next();
        int price = sc.nextInt();
        int quantity = sc.nextInt();
        int productId = sc.nextInt();

        // creating object of class Product
        Product product = new Product(productName, price,quantity,productId);

        if(product instanceof Product){
            product.displayDetails();
        }
    }
}