package lesson1;

/**
 * Напишите метод который принимает математическое выражение в формате String и возвращает результат.
 * В выражении используются только целые числа, поддерживаемые операции:+,-.
 * Пример:
 * 	math("2-1"); // вернёт [1]
 * 	math("2- +1"); // вернёт [1]
 * 	math(" 2-  -1"); // вернёт [3]
 */

public class task12 {

    public static void main(String[] args) {

        String[] array = {"2"};

        for (int i = 0; i < array.length; i++) {
            int is = getboolean(array[i]);
            System.out.println(is);
        }




    }

    private static int getboolean(String s) {
        Integer  is = null;

        is = Integer.valueOf(s);

        return is;
    }
}
