package com.kodilla.good.patterns.food2Door;

import java.util.HashMap;
import java.util.Map;

class Supplier {

    private String supplierName;
    private Supplier supplierAddress;
    private Supplier nip;
    public static Map<String, String> supplierProductMap = new HashMap<String, String>();

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Supplier getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(Supplier supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    public Supplier getNip() {
        return nip;
    }

    public void setNIP(Supplier nip) {
        this.nip = nip;
    }

    public static void main(String[] args) {
        supplierProductMap.put("ExtraFoodShop", "Food");
        supplierProductMap.put("HealthyShop", "Drugs");
        supplierProductMap.put("GlutenFreeShop", "Tofu");
    }
}
