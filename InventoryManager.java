import java.util.*;

public class InventoryManager {
    static Map<String, Integer> stock = new HashMap<>();

    public static void addItem(String name, int qty) {
        stock.put(name, stock.getOrDefault(name, 0) + qty);
    }

    public static void sellItem(String name, int qty) {
        stock.put(name, stock.getOrDefault(name, 0) - qty);
    }

    public static void listStock() {
        stock.forEach((k,v) -> System.out.println(k + ": " + v));
    }

    public static void main(String[] args) {
        addItem("Apples", 100);
        addItem("Bananas", 50);
        sellItem("Apples", 10);
        listStock();
    }
}
