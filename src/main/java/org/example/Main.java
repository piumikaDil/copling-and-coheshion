package org.example;


import org.example.controller.CalSalary;
import org.example.controller.UpdateOrder;
import org.example.entity.Item;
import org.example.entity.Order;
import org.example.temp_cohesion.solution.UserManager;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // stamp coupling
//        UpdateOrder updateOrder = new UpdateOrder();
//
//        Item item1 = new Item("Laptop", 1000.0, 1);
//        Item item2 = new Item("Mouse", 20.0, 2);
//
//        List<Item> items = Arrays.asList(item1, item2);
//        Order order = new Order("12345", "Alice", "Pending", items);
//
//        updateOrder.updateOrderStatus(order, "Shipped");
//
//        System.out.println("Order ID: " + order.getOrderId());
//        System.out.println("Customer: " + order.getCustomerName());
//        System.out.println("Status: " + order.getStatus());
//
//        CalSalary calSalary = new CalSalary();

        // data coupling
//        double hourlyRate = 25.0;
//        int hoursWorked = 160;
//
//        double salary = calSalary.calculateSalary(hourlyRate, hoursWorked);
//        System.out.println("Monthly Salary: $" + salary);


//        temp_cohesion
        UserManager userManager = new UserManager();
        userManager.handleUserAccount("john_doe", "john.doe@example.com");
    }
}