package com.nisum.GoodsService.domain;

public class Item {
    String itemName;
    String companyName;

    public Item(String itemName, String companyName) {
        this.itemName = itemName;
        this.companyName = companyName;
    }

    public String getItemName() {
        return itemName;
    }

    public String getCompanyName() {
        return companyName;
    }
}
