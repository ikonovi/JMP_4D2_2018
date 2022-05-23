package com.epm.jmp.d2.y2018.m11.t01.bookstore.service;

import com.epm.jmp.d2.y2018.m11.t01.bookstore.model.OrderItem;
import com.epm.jmp.d2.y2018.m11.t01.bookstore.model.StoreItem;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;


public class OrderServiceImpl implements OrderService {

    private Set<OrderItem> orderItems;

    public OrderServiceImpl() {
        this.orderItems = new HashSet<OrderItem>();
    }

    @Override
    public void addOrderItem(StoreItem storeItem, int qty) {
        boolean added = false;

        // Update item quantity in the order if the item has been already added to the cart.
        for (OrderItem orderItem : orderItems) {
            if (orderItem.getStoreItem().equals(storeItem)) {
                orderItem.setQuantity(orderItem.getQuantity() + qty);
                added = true;
            }
        }

        // Add new item
        if (!added)
            orderItems.add(new OrderItem(storeItem, qty));
    }

    @Override
    public boolean removeOrderItem(StoreItem storeItem) {
        boolean removed =
                orderItems.removeIf((OrderItem item) -> item.getStoreItem().equals(storeItem));
        return removed;
    }

    @Override
    public Set<OrderItem> getOrderItems() {
        return orderItems;
    }

    @Override
    public int getTotalPrice() {
        return orderItems.parallelStream()
                .flatMapToInt(
                        item -> IntStream.of(item.getStoreItem().getPrice() * item.getQuantity()))
                .sum();
    }

    @Override
    public void updateOrderItemQty(StoreItem storeItem, int qty) {
        orderItems.forEach(orderItem -> {
            if (orderItem.getStoreItem().equals(storeItem)) {
                orderItem.setQuantity(qty);
            }
        });
    }

}
