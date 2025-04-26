package tiposcuringa.aplication;

import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> myNumbers = Arrays.asList(2,3,4,5,6);
        printList(myNumbers);
        List<String> myStr = Arrays.asList("Maria", "Carlos", "Tu");
        printList(myStr);
    }

    public static void printList(List<?> list){
        //list.add(3) <- Da erro pois o compilador não vai saber se o tipo do valor "3" sera compativel com o tipo da lista
        for (Object item : list){
            System.out.println(item);
        }
    }
}

