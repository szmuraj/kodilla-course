package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task makeTask(final String taskClass) {
        return switch (taskClass) {
            case SHOPPINGTASK -> new ShoppingTask("ShoppingTask", "Buy a car", 1.00);
            case PAINTINGTASK -> new PaintingTask("PaintingTask", "Black", "My car");
            case DRIVINGTASK -> new DrivingTask("DrivingTask", "Warsaw", "Bicycle");
            default -> null;
        };
    }
}
