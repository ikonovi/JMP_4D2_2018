package com.epm.jmp.d2.y2018.m12.t03.bookstore.model;

public class OrderItem {

    private StoreItem storeItem;
    private int quantity;

    public OrderItem(StoreItem item, int quantity) {
        this.storeItem = item;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public StoreItem getStoreItem() {
        return storeItem;
    }

    public OrderItem getOrderItem() {
        return this;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((storeItem == null) ? 0 : storeItem.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OrderItem other = (OrderItem) obj;
        if (storeItem == null) {
            if (other.storeItem != null)
                return false;
        } else if (!storeItem.equals(other.storeItem))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "OrderItem [storeItem=" + storeItem + ", Qty=" + quantity + ", "
                + super.toString() + "]";
    }


}
