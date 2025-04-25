package genericosdelimitados.aplication;

import genericosdelimitados.entities.Product;
import genericosdelimitados.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args){

        List<Product> list = new ArrayList<>();

        String path = "CHANGE-ME";

        try (BufferedReader bf = new BufferedReader(new FileReader(path))){
            String line = bf.readLine();
            while (line != null){
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = bf.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println("Max:");
            System.out.println(x);
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
