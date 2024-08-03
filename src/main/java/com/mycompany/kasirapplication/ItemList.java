/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kasirapplication;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sevim
 */
class ItemList {
    private List<Item> items;

    public ItemList() {
        this.items = new ArrayList<>();
    }

    public void addItem(String name, int quantity, int price, int amount) {
        Item newItem = new Item(name, quantity, price, amount);
        items.add(newItem);
    }

    public void removeItem(String name) {
        items.removeIf(item -> item.getName().equals(name));
    }

    public void updateItem(String name, int quantity, int price, int amount) {
        for (Item item : items) {
            if (item.getName().equals(name)) {
                item.setQuantity(quantity);
                item.setPrice(price);
                item.setAmount(amount);
                break;
            }
        }
    }

    public List<Item> getItems() {
        return items;
    }

    @Override
    public String toString() {
        StringBuilder itemListString = new StringBuilder("ItemList{\n");
        for (Item item : items) {
            itemListString.append(item.toString()).append("\n");
        }
        itemListString.append("}");
        return itemListString.toString();
    }
}