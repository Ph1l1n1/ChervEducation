package lesson1;

/**
 * Напишите метод который бы проверял повторяются ли в переданном слове символы.
 * Пример:
 * containsRepeat("Актива"); // вернёт true
 * containsRepeat("Мышь"); // вернёт false
 */

public class task7 {
    public static void main(String[] args) {
        String[] array = {"Актива", "Мышь"};

        for (int i = 0; i < array.length; i++) {
            Boolean is = getboolean(array[i]);
            System.out.println(is);
        }
    }

    private static Boolean getboolean(String str) {
        Boolean is = false;
        char[] chars = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            String onechar = String.valueOf(chars[i]).toLowerCase();
            Integer num = 0;

            for (int j = 0; j < str.length(); j++) {
                String strchar = String.valueOf(chars[j]).toLowerCase();

                if (strchar.equals(onechar.toLowerCase())) {
                    num++;
                }
                if (num > 1) {
                    is = true;
                }
            }

        }


        return is;
    }

}

