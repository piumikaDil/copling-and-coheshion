package org.example.controller;

import org.example.entity.Order;

public class UpdateOrder {
    public void updateOrderStatus(Order order, String newStatus) {
       order.setStatus(newStatus);
    }
}
