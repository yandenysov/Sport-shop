package app.builder;

import app.items.CapBlack;
import app.items.CapWhite;
import app.items.TeeBlue;
import app.items.TeeRed;

public class OrderBuilder {
    public OrderModel orderA() {
        OrderModel order = new OrderModel();
        order.addItem(new TeeRed());
        order.addItem(new CapWhite());
        return order;
    }

    public OrderModel orderB() {
        OrderModel order = new OrderModel();
        order.addItem(new TeeBlue());
        order.addItem(new CapBlack());
        return order;
    }
}
