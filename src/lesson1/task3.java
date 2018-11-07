package lesson1;

/**
 * Напишите метод который бы приветствовал человека по его имени, метод должен принимать один аргутмент String
 * и выводить на консоль приветствие.
 * Пример:
 * sayHello("олег"); //вернёт "Привет Олег!"
 * sayHello("ДЕНИС"); //вернёт "Привет Денис!"
 * sayHello(""); //вернёт "Привет!"
 */

public class task3 {

    public static void main(String[] args) {
        String[] array = {"олег", "ДЕНИС", ""};

        for (int i = 0; i < array.length; i++) {
            sayHello(array[i]);
        }

    }

    private static void sayHello(String str) {
        System.out.println("Привет " + str + "!");
    }
    //* sayHello(""); //вернёт "Привет!" - Тут должен быть пробел

}
