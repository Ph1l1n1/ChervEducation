package lesson1;

/**
 * public static void main(String[] args) {
 *         int a = 100;
 *         double b = 3;
 *         System.out.println(a/b); // выведет в консоль 33.333333333333336
 *     }
 * Объясните почему на экране будет напечатано дробное число
 */


public class task15 {

    public static void main(String[] args) {

        int a = 100;
       double b = 3;
       System.out.println(a/b); // выведет в консоль 33.333333333333336

        // Ответ: выведет дробное число потому что double - число с двойной точностью, поэтому все математические функции возвращают число типа double

    }
}
