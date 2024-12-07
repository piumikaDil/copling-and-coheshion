package org.example.entity;

import java.util.List;

public class Order {
    String orderId;
    String customerName;
    String status;
    List<Item> items;

    public Order(String orderId, String customerName, String status, List<Item> items) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.status = status;
        this.items = items;
    }

    public String getStatus() {
        return status;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
