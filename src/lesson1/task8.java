package lesson1;

/**
 * Напишите метод который бы принимал аргумент типа int и возвращал его факториал.
 * Пример:
 * factorial(3); //вернёт 6
 * factorial(-3); //вернёт 0
 * factorial(0); //вернёт 0
 */

public class task8 {

    public static void main(String[] args) {
        Integer[] array = {3, -3, 0};

        for (int i = 0; i < array.length; i++) {
            Integer num = getarray(array[i]);
            System.out.println(num);
        }

    }

    private static Integer getarray(Integer num) {
        Integer num2 = Math.abs(num);

        int result = 1;
        for (int i = 1; i <= num2; i++) {
            result = result * i;
        }

        if (num != num2) {
            result = result * (-1);
        }


        return result;
    }


}
