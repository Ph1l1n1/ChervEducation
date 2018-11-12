package lesson1;

/**
 * Напишите метод который принимает ФИО и выводит на экран "Фамилия Имя"
 * Пример:
 * format("Гуляев Гавриил Парфеньевич"); // выведет на экран "Гавриил Гуляев"
 */

public class task13 {
    public static void main(String[] args) {
        String FIO = "Гуляев Гавриил Парфеньевич";
        String FI = getFI(FIO);
        System.out.println(FI);

    }

    private static String getFI(String fio) {
        String f = null;
        String im = null;

        int num = fio.indexOf(" ");
        f = fio.substring(0, num);
        fio = fio.substring(num + 1, fio.length());

        num = fio.indexOf(" ");
        im = fio.substring(0, num);


        String imf = im + " " + f;
        return imf;
    }


}
