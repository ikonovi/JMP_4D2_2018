package com.epm.jmp.d2.y2018.m12.t03.bookstore.service;

import com.epm.jmp.d2.y2018.m12.t03.bookstore.model.OrderItem;
import com.epm.jmp.d2.y2018.m12.t03.bookstore.model.StoreItem;

import java.util.Set;


public interface OrderService {

    void addOrderItem(StoreItem storeItem, int qty);

    boolean removeOrderItem(StoreItem storeItem);

    void updateOrderItemQty(StoreItem storeItem, int qty);

    Set<OrderItem> getOrderItems();

    int getTotalPrice();

}
