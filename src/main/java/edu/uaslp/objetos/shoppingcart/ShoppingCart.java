package edu.uaslp.objetos.shoppingcart;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {

    private final Map<String, Integer> items;
    private final ShoppingItemCatalog itemCatalog;

    public ShoppingCart(ShoppingItemCatalog itemCatalog) {
        this.itemCatalog = itemCatalog;
        items = new HashMap<>();
    }

    public void add(String itemCode) {
        int currentCount = items.getOrDefault(itemCode, 0);
        items.put(itemCode, currentCount + 1);
    }

    public List<ShoppingItem> getItems() {
        List<ShoppingItem> itemList = new ArrayList<>();
        for (String itemCode : items.keySet()) {
            ShoppingItem item = itemCatalog.getItem(itemCode);
            for (int i = 0; i < items.get(itemCode); i++) {
                itemList.add(item);
            }
        }
        return itemList;
    }

    public Collection<ShoppingItem> getDistinctItems() {
        List<ShoppingItem> itemList = new ArrayList<>();
        for (String itemCode : items.keySet()) {
            ShoppingItem item = itemCatalog.getItem(itemCode);
            itemList.add(item);
        }
        return itemList;
    }

    public int getTotalCostInCents() {
        int totalCost = 0;
        for (ShoppingItem item : getItems()) {
            totalCost += item.getUnitCostInCents();
        }
        return totalCost;
    }

    public int getDistinctItemsCount() {
        return items.size();
    }

    public int getTotalItemsCount() {
        int totalCount = 0;
        for (int count : items.values()) {
            totalCount += count;
        }
        return totalCount;
    }
}