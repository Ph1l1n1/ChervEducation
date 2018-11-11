package lesson1;

/**
 * Напишите метод "invoke" который бы  изменял местами значения переменных без использования третьей.
 * Пример:
 * public static void main(String[] args) {
 * Integer a = 1;
 * Integer b = 2;
 * invoke(a, b);
 * System.out.println("a = " + a); // вернёт 2
 * System.out.println("b = " + b); // вернёт 1
 */

public class task14 {
    public static Integer a = 1;
    public static Integer b = 2;


    public static void main(String[] args) {

        invoke();
        System.out.println("a = " + a); // вернёт 2
        System.out.println("b = " + b); // вернёт 1


    }

    private static void invoke() {

        a = a + b;
        b = a - b;
        a = a - b;

    }
}
