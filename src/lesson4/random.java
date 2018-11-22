package lesson4;

//Напишите метод который бы случайным образом смешивал элементы коллекции типа List

import java.util.Arrays;
import java.util.List;

public class random {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);

        //integerList.sort((right, left) -> left - right);

        System.out.println(integerList);


    }

}
