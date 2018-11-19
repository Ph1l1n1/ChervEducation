package lesson3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Ваша задача - отсортировать заданную строку. Каждое слово в строке будет содержать одно число. Это число - это позиция, которую должно иметь слово в результате.
 * Примечание. Числа могут быть от 1 до 9.
 * Если входная строка пуста, верните пустую строку. Слова во входной строке будут содержать только допустимые последовательные числа.
 * <p>
 * Примеры:
 * "is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
 * "4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
 * ""  -->  ""
 */
public class task2 {

    public static void main(String[] args) {
        String str = "4of Fo1r pe6ople g3ood th5e the2";

        String[] arrayword = str.split(" ");
        String[] arraybysort = new String[arrayword.length+1];

        for (int i = 0; i < arrayword.length; i++) {
            int numofsort = Integer.parseInt(arrayword[i].replaceAll("\\D+",""));
            arraybysort[numofsort] = arrayword[i];
        }

        System.out.println(Arrays.toString(arraybysort));
    }


}