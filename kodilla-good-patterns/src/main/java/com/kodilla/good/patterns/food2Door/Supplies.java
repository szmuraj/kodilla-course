package com.kodilla.good.patterns.food2Door;

import java.util.HashMap;
import java.util.Map;

public class Supplies {

    private static double amount;

    static Product product = new Product();
    static Supplier supplier = new Supplier();



    public Supplies(double amount) {
        Supplies.amount = amount;
    }

    public double getAmount() {
        return Supplies.amount;
    }

    public void setAmount(double amount) {
        Supplies.amount = amount;
    }



    public static void main (String[] args) {
        Map<String, String> supplierProductMap = new HashMap<>();
        supplierProductMap.put("ExtraFoodShop", "Food");
        supplierProductMap.put("HealthyShop", "Drugs");
        supplierProductMap.put("GlutenFreeShop", "Tofu");
    }
    public void process() {

        System.out.println("Our products are from " + supplier.getSupplierName() + " in " + amount + " of " + product.getProductType());
    }
}
