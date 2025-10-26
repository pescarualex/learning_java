package org.example;

public class Cart {
    private String whatToBuy;
    private double price;
    private int quantity;

    public Cart(){}

    public double totalCost(double price, int quantity){
        double totalPrice = 0;
        totalPrice = price * quantity;
        return totalPrice;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getWhatToBuy() {
        return whatToBuy;
    }

    public void setWhatToBuy(String whatToBuy) {
        this.whatToBuy = whatToBuy;
    }
}
