package curingasdelimitados.aplication;

import java.lang.Object;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Integer> myInt = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(1.1, 2.2, 3.4);
        List<Object> myObj = new ArrayList<Object>();

        copy(myInt, myObj);
        printList(myObj);
        copy(myDoubles, myObj);
        printList(myObj);
    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny){
        for (Number number : source){
            destiny.add(number);
        }
    }

    public static void printList(List<?> list){
        for (Object item : list){
            System.out.print(item + " ");
        }
        System.out.println();
    }

}
