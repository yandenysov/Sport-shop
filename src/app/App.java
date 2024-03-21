package app;

import app.builder.OrderBuilder;
import app.builder.OrderModel;

public class App {
    public static void main(String[] args) {
        OrderBuilder orderBuilder = new OrderBuilder();

        OrderModel orderA = orderBuilder.orderA();
        System.out.println("Order A: ");
        orderA.showItems();
        System.out.println("Total cost: " + orderA.getTotalCost());

        OrderModel orderB = orderBuilder.orderB();
        System.out.println("\nOrder B: ");
        orderB.showItems();
        System.out.println("Total order cost: " + orderB.getTotalCost() + "USD");
    }
}
