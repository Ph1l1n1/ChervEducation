package lesson4;


// Напишите метод который бы отсортировал переданную коллекцию типа List(от большего к меньшему) [1,3,5,2]=>[5,3,2,1]

import java.util.*;

public class sort {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,3,5,2);

        integerList.sort((right, left) -> left - right);

        System.out.println(integerList);





    }

}
