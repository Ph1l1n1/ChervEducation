package lesson1;

import java.util.Collections;
import java.util.HashSet;

/**
 * Напишите метод который принимает массив int и возвращает этот массив без дубликатов.
 * Пример:
 * delDuplicates([1,2,3,4,3,2,5]); // вернёт [1,2,3,4,5]
 * delDuplicates([]); // вернёт []
 */

public class task4 {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 3, 2, 5};

        array = getarray(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    private static Integer[] getarray(Integer[] array) {
        HashSet<Integer> bufarray = new HashSet<Integer>();
        Collections.addAll(bufarray, array);
        array = bufarray.toArray(new Integer[0]);
        return array;
    }

}
