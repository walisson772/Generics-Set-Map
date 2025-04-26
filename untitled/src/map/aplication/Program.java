package map.aplication;



import map.entities.Product;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {

        Map<Product, Double> estoque = new TreeMap<>();

        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("Notebook", 1200.0);
        Product p3 = new Product("Table", 800.0);

        estoque.put(p1, 1000.0);
        estoque.put(p2, 2000.0);
        estoque.put(p3, 30000.0);

        Product ps = new Product("Tv", 900.0);

        System.out.println("Contains 'ps' Key: " + estoque.containsKey(ps));

    }
}
