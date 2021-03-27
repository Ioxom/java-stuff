package ca.ioxom.part9.inheritance;

import java.util.ArrayList;

public class Warehouse {
    protected double balance;
    protected final double capacity;

    public Warehouse(double capacity) {
        if (capacity <= 0) {
            this.capacity = 0;
        } else {
            this.capacity = capacity;
        }

        this.balance = 0;
    }

    public void addToWarehouse(double amount) {
        if (balance + amount <= capacity) {
            balance += amount;
        }
    }

    public double takeFromWarehouse(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
            return amount;
        } else {
            try {
                return amount - balance;
            } finally {
                balance = 0;
            }
        }
    }

    @Override
    public String toString() {
        return "balance = " + balance + ", space left " + howMuchSpaceLeft();
    }

    public double getBalance() {
        return balance;
    }

    public double getCapacity() {
        return capacity;
    }

    public double howMuchSpaceLeft() {
        //what in the actual what is this math
        //all I know is that I was annoyed by all the 11.299999999999955 garbage and did a thing
        return  (double) Math.round(capacity - balance) + ((double) Math.round(Math.abs(balance - Math.round(balance)) * 10) / 10);
    }

    public static class ProductWarehouse extends Warehouse {
        private String productName;

        public ProductWarehouse(String productName, double capacity) {
            super(capacity);
            this.productName = productName;
        }

        public String getName() {
            return productName;
        }

        public void setName(String newName) {
            productName = newName;
        }

        @Override
        public String toString() {
            return productName + ": " + super.toString();
        }
    }

    public static class ChangeHistory {
        private ArrayList<Double> changes;

        public ChangeHistory() {
            changes = new ArrayList<>();
        }

        public void add(double status) {
            changes.add(status);
        }

        public void clear() {
            changes = new ArrayList<>();
        }

        public double maxValue() {
            if (changes.isEmpty()) {
                return 0;
            }

            double maxValue = changes.get(0);
            for (int i = 1; i < changes.size(); i++) {
                double change = changes.get(i);
                if (change > maxValue) {
                    maxValue = change;
                }
            }

            return maxValue;
        }

        public double minValue(){
            if (changes.isEmpty()) {
                return 0;
            }

            double minValue = changes.get(0);
            for (int i = 1; i < changes.size(); i++) {
                double change = changes.get(i);
                if (change < minValue) {
                    minValue = change;
                }
            }

            return minValue;
        }

        public double average() {
            if (changes.isEmpty()) {
                return 0;
            }

            double sum = 0;
            for (double i : changes) {
                sum += i;
            }

            return sum / changes.size();
        }

        public String toString() {
            return changes.toString();
        }
    }

    public static class ProductWarehouseWithHistory extends ProductWarehouse {
        private final ChangeHistory history;
        public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
            super(productName, capacity);
            history = new ChangeHistory();

            addToWarehouse(initialBalance);
        }

        @Override
        public void addToWarehouse(double amount) {
            if (balance + amount <= capacity) {
                balance += amount;
            }
            history.add(balance);
        }

        @Override
        public double takeFromWarehouse(double amount) {
            try {
                if (balance - amount >= 0) {
                    balance -= amount;
                    return amount;
                } else {
                    try {
                        return amount - balance;
                    } finally {
                        balance = 0;
                    }
                }
            } finally {
                history.add(balance);
            }
        }

        public String history() {
            return history.toString();
        }

        public void printAnalysis() {
            System.out.println("History: " + history());
            System.out.println("Largest amount of product: " + history.maxValue());
            System.out.println("Smallest amount of product: " + history.minValue());
            System.out.println("Average: " + history.average());
        }
    }

    public static void main(String[] arrgs) {
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        juice.addToWarehouse(1.0);

        juice.printAnalysis();
    }
}
