package ca.ioxom.part9.interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Store {
    private final Warehouse warehouse;
    private final Scanner scanner;

    public Store(Warehouse warehouse, Scanner scanner) {
        this.warehouse = warehouse;
        this.scanner = scanner;
    }

    // the method that handles the customers visit to the store.
    public void shop(String customer) {
        ShoppingCart cart = new ShoppingCart();
        System.out.println("Welcome to the store " + customer);
        System.out.println("our selection:");

        for (String product : this.warehouse.products()) {
            System.out.println(product);
        }

        while (true) {
            System.out.print("What to put in the cart (press enter to go to the register): ");
            String product = scanner.nextLine();
            if (product.isEmpty()) {
                break;
            } else {
                if (warehouse.products().contains(product) && warehouse.stock(product) > 0) {
                    cart.add(product, warehouse.price(product));
                    warehouse.take(product);
                }
            }
        }

        System.out.println("your shopping cart contents:");
        cart.print();
        System.out.println("total: " + cart.price());
    }

    public static class Warehouse {
        private final Map<String, Integer> prices;
        private final Map<String, Integer> stocks;

        public Warehouse() {
            prices = new HashMap<>();
            stocks = new HashMap<>();
        }

        public void addProduct(String product, int price, int stock) {
            prices.put(product, price);
            stocks.put(product, stock);
        }

        public int price(String productName) {
            return prices.getOrDefault(productName, -99);
        }

        public int stock(String productName) {
            return stocks.getOrDefault(productName, 0);
        }

        public boolean take(String productName) {
            if (stocks.containsKey(productName) && stocks.get(productName) > 0) {
                stocks.put(productName, stocks.get(productName) - 1);
                return true;
            } else {
                return false;
            }
        }

        public Set<String> products() {
            return prices.keySet();
        }

        public static void main(String[] arrgs) {
            Warehouse warehouse = new Warehouse();
            warehouse.addProduct("coffee", 5, 10);
            warehouse.addProduct("milk", 3, 20);
            warehouse.addProduct("cream", 2, 55);
            warehouse.addProduct("bread", 7, 8);

            Scanner scanner = new Scanner(System.in);

            Store store = new Store(warehouse, scanner);
            store.shop("John");
        }
    }

    public static class Item {
        private final String name;
        private int quantity;
        private final int individualPrice;

        public Item(String product, int qty, int unitPrice) {
            name = product;
            quantity = qty;
            individualPrice = unitPrice;
        }

        public int price() {
            return individualPrice * quantity;
        }

        public void increaseQuantity() {
            quantity ++;
        }

        @Override
        public String toString() {
            return name + ": " + quantity;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Item item = (Item) o;
            return individualPrice == item.individualPrice && Objects.equals(name, item.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, quantity, individualPrice);
        }
    }

    public static class ShoppingCart {
        private final List<Item> items;

        public ShoppingCart() {
            items = new ArrayList<>();
        }

        public void add(String product, int price) {
            Item item = new Item(product, 1, price);
            if (items.contains(item)) {
                items.get(items.indexOf(item)).increaseQuantity();
            } else {
                items.add(new Item(product, 1, price));
            }
        }

        public int price() {
            int price = 0;
            for (Item item : this.items) {
                price += item.price();
            }

            return price;
        }

        public void print() {
            for (Item item : items) {
                System.out.println(item);
            }
        }
    }
}
