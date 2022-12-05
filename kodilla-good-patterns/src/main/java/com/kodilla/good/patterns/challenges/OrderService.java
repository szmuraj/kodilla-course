package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderService {
    public static class OrderDTO {
        private boolean isOrdered;
        private String deliveryPlace;
        private LocalDateTime orderDateTime;


        public OrderDTO(final boolean isOrdered, final String deliveryPlace, final LocalDateTime orderDateTime) {
            this.isOrdered = isOrdered;
            this.deliveryPlace = deliveryPlace;
            this.orderDateTime = orderDateTime;
        }

        public OrderDTO(User userID, boolean b) {
        }
    }
    public boolean order(final User user, final double amount, final Product product, final int seller, final String deliveryPlace, final LocalDateTime orderDateTime) {
        System.out.println("Ordering " + amount + product +  " for: " + user.getUserName()
                + " to " + deliveryPlace + " at " + orderDateTime + ". ");

        return true;
    }

    public static class OrderRequest {
        private int amount;
        private String deliveryPlace;
        private LocalDateTime orderDateTime;
        public double getAmount() {
            return amount;
        }
        public String getDeliveryPlace() {
            return deliveryPlace;
        }
        public LocalDateTime getOrderDate() {
            return orderDateTime;
        }
    }
}
