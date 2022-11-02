package com.clothingfly.catalog;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.Id;

@Entity
@Table(name = "items")
public class Item {

    @Id
    @Column
    private long id;
    @Column
    private String name;
    @Column
    private float price;
    @Column
    private String imageUrl;
    @Column
    private long quantity;
    @Column
    private long inventory;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public long getQuantity() {
        return quantity;
    }

    public long getInventory() {
        return inventory;
    }

    public String getImageUrl(){
        return imageUrl;
    }

    public void setInventory(long inventory) {
        this.inventory = inventory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public Item(){

    }

    public Item(long id, String name, float price, long quantity, long inventory, String imageUrl) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.inventory = inventory;
        this.imageUrl = imageUrl;
    }
}
