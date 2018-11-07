package lesson1;

/**
 * Напишите метод который принимает String и возвращает данную строку в обратном порядке символов.
 * Пример:
 * 	reverseWord("переверни строку"); //вернёт "укотрс инревереп"
 */

public class task2 {

    public static void main(String[] args) {
        String str = "переверни строку cучечке";
        str = getnoborot(str);

        System.out.println(str);
    }

    private static String getnoborot(String str) {
        StringBuffer str2 = new StringBuffer(str);
        return String.valueOf(str2.reverse());
    }


}
