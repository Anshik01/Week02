import java.util.ArrayList;
import java.util.List;
class Product
{
    private String name;
    private double price;

    public Product(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }
}

class Order
{
    private List<Product> products;
    private Customer1 customer;

    public Order(Customer1 customer)
    {
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product)
    {
        products.add(product);
    }

    public List<Product> getProducts()
    {
        return products;
    }

    public Customer1 getCustomer()
    {
        return customer;
    }

    public double getTotalPrice()
    {
        double total = 0;
        for (Product product : products)
        {
            total += product.getPrice();
        }
        return total;
    }
}

class Customer1 {
    private String name;
    private List<Order> orders;

    public Customer1(String name)
    {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    public void placeOrder(Order order)
    {
        orders.add(order);
    }

    public List<Order> getOrders()
    {
        return orders;
    }
}

public class Ecommerce
{
    public static void main(String[] args)
    {
        Customer1 customer = new Customer1("Aryan chaurasia");
        Product product1 = new Product("Headphone", 2000.00);
        Product product2 = new Product("Mobile", 8000.00);

        Order order = new Order(customer);
        order.addProduct(product1);
        order.addProduct(product2);

        customer.placeOrder(order);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Order Total: " + order.getTotalPrice());
        System.out.println("Products in the Order:");
        for (Product product : order.getProducts()) {
            System.out.println("- " + product.getName() + ":  " + product.getPrice());
        }
    }
}
