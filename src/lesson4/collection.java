package lesson4;


// Напишите метод который бы переворачивал коллекцию типа List. [1,2,3,4,5]=>[5,4,3,2,1]

import java.util.*;

public class collection {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);

        Collections.reverse(integerList);

        System.out.println(integerList);





    }

}
