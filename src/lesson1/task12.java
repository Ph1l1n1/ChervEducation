package lesson1;


import java.util.ArrayList;

/**
 * Напишите метод который принимает математическое выражение в формате String и возвращает результат.
 * В выражении используются только целые числа, поддерживаемые операции:+,-.
 * Пример:
 * math("2-1"); // вернёт [1]
 * math("2- +1"); // вернёт [1]
 * math(" 2-  -1"); // вернёт [3]
 */

public class task12 {

    public static void main(String[] args) {

        String[] array = {"2-1", "2- +1", " 2-  -1"};

        for (int i = 0; i < array.length; i++) {
            int num = getnum(array[i]);


            System.out.println(num);
        }
    }

    private static int getnum(String string) {
        int result = 0;
        String numbers = "0123456789";
        String operations = "+-/*";


        for (int i = 0; i < string.length(); i++) {
            String symbol = String.valueOf(string.charAt(i));
            if (!symbol.equals(" ")) {

                if (numbers.contains(string.charAt(i) + "")) {
                    result = result * 10 + (Integer.parseInt(string.charAt(i) + ""));
                } else {
                    if (string.charAt(i) == '+') {
                        result += getnum(string.substring(i + 1));
                    }
                    if (string.charAt(i) == '-') {
                        result -= getnum(string.substring(i + 1));
                    }
                    break;
                }

            }
        }
        return result;
    }
}
