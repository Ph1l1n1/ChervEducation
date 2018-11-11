package lesson1;

/**
 * Напишите метод который бы принимал параметр String - номер телефона 10 символов (от 0 до 9) и возвращал отформатированный номер.
 * Пример:
 * format("9136758070"); //вернёт "+7 (913) 675-80-70"
 */


public class task10 {
    public static void main(String[] args) {
        String number = "9136758070";

        number = formats(number);

        System.out.println(number);

    }

    private static String formats(String number) {

        number = String.valueOf(number).replaceFirst("(\\d{3})(\\d{3})(\\d+)", "+7 ($1)-$2-$3");

        return number;
    }

}
