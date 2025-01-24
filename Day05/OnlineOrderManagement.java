// Defining Parent class
class Orders{
    // declaring attributes
    String orderId;
    String orderDate;

    // constructor of parent class
    Orders(String orderId, String orderDate){
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to display order detail
    void getOrderDetails(){
        System.out.println("Order ID is : " + orderId);
        System.out.println("Order Date : " + orderDate);
    }
}

class ShippedOrder extends Orders{
    long trackingNumber;   // unique attribute

     ShippedOrder(String orderId, String orderDate, long trackingNumber){
         super(orderId, orderDate);
         this.trackingNumber = trackingNumber;
     }

     // Overridden method
     @Override
     void getOrderDetails(){
         super.getOrderDetails();
         System.out.println("Tracking Number : " + trackingNumber);
     }
}

class DeliveredOrder extends ShippedOrder{
    String deliveryDate;   // unique attribute

    DeliveredOrder(String orderId, String orderDate, long trackingNumber, String deliveryDate){
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    // Overridden method
    @Override
    void getOrderDetails(){
        super.getOrderDetails();
        System.out.println("Delivery date : " + deliveryDate);
    }
}
public class OnlineOrderManagement {
    public static void main(String[] args) {
        // creating object for base class
        Orders order = new Orders("OR1021", "15-01-2025");
        order.getOrderDetails();
        System.out.println();

        // creating object of ShippedOrder class
        ShippedOrder shippedOrder = new ShippedOrder("OR1021", "15-01-2025", 10214578);
        shippedOrder.getOrderDetails();
        System.out.println();

        // creating object of DeliveredOrder
        DeliveredOrder deliveredOrder = new DeliveredOrder("OR1021", "15-01-2025", 10214578, "21-01-2025");
        deliveredOrder.getOrderDetails();
        System.out.println();
    }
}
