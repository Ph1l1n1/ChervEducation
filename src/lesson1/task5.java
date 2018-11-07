package lesson1;

/**
 * Напишите метод который бы маскировал все символы кроме 2-ух последних.
 * Пример:
 * mask("85632983256"); // вернёт "#########56"
 * mask("56"); // вернёт "##"
 * mask("3"); // вернёт "3"
 * mask(""); // вернёт ""
 * mask("ierfu"); // вернёт "###fu"
 */

public class task5 {
    public static void main(String[] args) {
        String[] array = {"85632983256", "56", "3", "", "ierfu"};

        array = getarray(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static String[] getarray(String[] array) {
        for (int i = 0; i < array.length; i++) {

            String str = array[i];

            for (int j = 0; j < str.length() - 2; j++) {
                StringBuffer str2 = new StringBuffer(str);
                str2.replace(j, j + 1, "#");
                str = String.valueOf(str2);
            }
            array[i] = str;
        }

        return array;
    }
}
