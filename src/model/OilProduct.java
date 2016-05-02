/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author scheldejonas
 */
public class OilProduct implements Comparable<OilProduct> {
    
    private String name;
    private int price;
    private int amount;

    public OilProduct(String name, int price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "OilProduct{" + "name=" + name + ", price=" + price + ", amount=" + amount + '}';
    }

    @Override
    public int compareTo(OilProduct other) {
        if (equals(other)) {
            return 0;
        }
        int CompResult = this.name.compareTo(other.getName());
        if (CompResult == 0) {
            if (this.amount < other.getAmount()) {
                return 1;
            }
            else if (this.amount > other.getAmount()) {
                return -1;
            }
            else {
                return 0;
            }
        }
        return CompResult;
    }

}
