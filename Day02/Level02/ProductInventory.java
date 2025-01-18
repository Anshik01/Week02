// definition of Product class
class Product {
    // declaring the attributes of this class
    // declaring attributes private for security
    private String productName;
    private float price;
    static int totalProducts; // number of total products

    // created a parameterized constructor to get the values of the attributes from the user
    Product(String productName, float price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // created a method to display the details of all products
    static void displayProductDetails(Product [] obj) {
        // displaying all product details
        for (int i = 0; i < obj.length; i++) {
            System.out.println("product name: " + obj[i].productName + ", price: " + obj[i].price);
        }
    }

    // created the method to find the total number of objects
    static void displayTotalProducts() {
        System.out.println("total number of products: " + totalProducts);
    }
}

// definition of ProductInventory class
public class ProductInventory {
    public static void main(String[] args) {
        // created an array of objects of Product class
        Product[] obj = new Product[5];

        // initializing all objects
        for (int i = 0; i < 5; i++) {
            obj[i] = new Product("product"+(i+1), (i+1)*1000);
        }

        // displaying the details of all objects
        Product.displayProductDetails(obj);

        // display total number of products
        Product.displayTotalProducts();
    }
}