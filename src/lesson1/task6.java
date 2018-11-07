package lesson1;

/**
 * Напишите метод который бы принимал int и возвращал его отрицательно значение.
 * Пример:
 * negative(3); //вернёт -3
 * negative(0); //вернёт 0
 * negative(-12); //вернёт -12
 */

public class task6 {
    public static void main(String[] args) {
        Integer[] array = {3, 0, -12};

        array = getarray(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    private static Integer[] getarray(Integer[] array) {

        for (int i = 0; i < array.length; i++) {
            Integer num = (Math.abs(array[i]) * (-1));
            array[i] = num;
        }


        return array;
    }


}
