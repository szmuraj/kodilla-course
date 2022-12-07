package com.kodilla.good.patterns.food2Door;
public class Supplies {

    private static double amount;

    private static Product product;
    private static Supplier supplier;

    public Supplies(double amount) {
        Supplies.amount = amount;
    }

    public static double getAmount() {
        return Supplies.amount;
    }

    public static void setAmount(double amount) {
        Supplies.amount = amount;
    }



    public static void main (String[] args) {
        setAmount(5.0);
        supplier.setSupplierName("ExtraFoodShop");
        product.setProductType("Food");
        process();
    }
    public static void process() {
        product.getProductType();
        System.out.println("You order " + getAmount() + " of " + product.getProductType() + " from" + supplier.getSupplierName());
    }

}
