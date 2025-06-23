package com.jitu.dailytarget.may12.innerclassdeliverydetails;

public class OnlineOrder {
    private int orderId;
    private String product;

    public OnlineOrder(int orderId, String product) {
        this.orderId = orderId;
        this.product = product;
    }

    public class DeliveryDetails {
        private String address;
        private String deliveryDate;

        public DeliveryDetails(String address, String deliveryDate) {
            this.address = address;
            this.deliveryDate = deliveryDate;
        }

        public String getAddress() {
            return address;
        }

        public String getDeliveryDate() {
            return deliveryDate;
        }
    }

    public void printOrderWithDeliveryDetails(DeliveryDetails details) {
        System.out.println("Order ID: " + orderId);
        System.out.println("Product: " + product);
        System.out.println("Delivery Address: " + details.getAddress());
        System.out.println("Delivery Date: " + details.getDeliveryDate());
    }

    public static void main(String[] args) {
        OnlineOrder order = new OnlineOrder(1001, "Laptop");
        DeliveryDetails delivery = order.new DeliveryDetails("123 Main St", "2025-05-15");

        order.printOrderWithDeliveryDetails(delivery);
    }
}
