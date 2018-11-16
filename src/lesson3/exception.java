package lesson3;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class exception {
    public static void main(String[] args) throws Exception {
        Character[] strings = new Character[20];
        fillArray(strings);
        System.out.println(Arrays.toString(strings));

        // необходимо написать метод checkArray() который бы проверил, что в данном массиве содержатся только цифры
        // если оказалось что в массиве оказался другой символ - выбросить исключение
        //  и обработать его в методе main() - вывести в консоль какой элемент не подошёл под условие "только цифры".
        // если проверка прошла то необходимо вывести в консоль что проверка прошла
        checkArray(strings);

        System.out.println("Проверка успешна!");
    }

    private static void checkArray(Character[] strings) throws Exception {
        ArrayList<String> exept = new ArrayList<String>();

        for (int i = 0; i < strings.length; i++) {
            try {
                int num = Integer.parseInt(String.valueOf(strings[i]));
            } catch (Exception ex) {
                throw new Exception("Есть буква: " + String.valueOf(strings[i]));
            }

        }

    }

    private static void fillArray(Character[] strings) {
        Random r = new Random();
        String alphabet = "1234567890b";
        //String alphabet = "sdfzb";
        for (int i = 0; i < strings.length; i++) {
            strings[i] = Character.valueOf(alphabet.charAt(r.nextInt(alphabet.length())));
        }
    }
}