package exercicio.aplication;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args){

        Map<String, Integer> candidatos = new LinkedHashMap<>();

        String path = "CHANGE-ME";

        try (BufferedReader bf = new BufferedReader(new FileReader(path))){
            String line = bf.readLine();

            while (line != null){
                String[] fields = line.split(",");
                String name = fields[0];
                int count = Integer.parseInt(fields[1]);

                if (candidatos.containsKey(name)){
                    int votos = candidatos.get(name);
                    candidatos.put(name, count + votos);
                }
                else {
                    candidatos.put(name, count);
                }
                line = bf.readLine();
            }
            System.out.println("Candidatos:");
            for (String item : candidatos.keySet()){
                System.out.println(item + " " + candidatos.get(item));
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
