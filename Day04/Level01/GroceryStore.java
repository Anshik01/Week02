import java.util.ArrayList;
import java.util.List;
class Customer {
    private String name;
    private List<Product> products;

    public Customer(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }
}

class Product {
    private String name;
    private double pricePerUnit;
    private double quantity;

    public Product(String name, double pricePerUnit, double quantity) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return pricePerUnit * quantity;
    }
}

class BillGenerator {
    public double computeTotal(Customer customer) {
        double total = 0;
        for (Product product : customer.getProducts()) {
            total += product.getTotalPrice();
        }
        return total;
    }

    public void generateBill(Customer customer) {
        System.out.println("Bill for " + customer.getName() + ":");
        for (Product product : customer.getProducts()) {
            System.out.println(product.getName() + " (" + product.getQuantity() + " units at $" + product.getPricePerUnit() + " per unit): $" + product.getTotalPrice());
        }
        System.out.println("Total: $" + computeTotal(customer));
    }
}

public class GroceryStore {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice");
        customer.addProduct(new Product("Apples", 3.0, 2.0));
        customer.addProduct(new Product("Milk", 2.0, 1.0));

        BillGenerator billGenerator = new BillGenerator();
        billGenerator.generateBill(customer);
    }
}