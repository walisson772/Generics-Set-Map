package set.aplication;

import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("Tv");
        set.add("Notebook");
        set.add("Tablet");

        set.removeIf( x -> x.length() >= 3);

        for (String i : set){
            System.out.println(i);
        }
    }
}
