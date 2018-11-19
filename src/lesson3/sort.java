package lesson3;

import java.util.Arrays;

/**
 * Напишите метод sortCards() который сортирует перетасованный список карт, так что любой список карт сортируется по рангу,
 * независимо от начальной коллекции.
 * Все карты в списке представлены в виде строк, так что отсортированный список карт выглядит следующим образом:
 * ['A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K']
 * <p>
 * Пример:
 * sortCards(new String[]['3', '9', 'A', '5', 'T', '8', '2', '4', 'Q', '7', 'J', '6', 'K'])
 * ['A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K']
 */

public class sort {

    public static void main(String[] args) {
        Character[] array = {'3', '9', 'A', '5', 'T', '8', '2', '4', 'Q', '7', 'J', '6', 'K'};

        sortCards(array);
    }

    private static void sortCards(Character[] array) {
        String[] newarraystr = new String[13];

        int[] newarray = chartoint(array);

        for (int i = 0; i < newarray.length; i++) {
            if ((newarray[i]>1) & (newarray[i]<10) ) {
                newarraystr[i] = String.valueOf(newarray[i]);
            } else {
                if (newarray[i]==1) {
                    newarraystr[i] = "A";
                }
                if (newarray[i]==10) {
                    newarraystr[i] = "T";
                }
                if (newarray[i]==11) {
                    newarraystr[i] = "J";
                }
                if (newarray[i]==12) {
                    newarraystr[i] = "Q";
                }
                if (newarray[i]==13) {
                    newarraystr[i] = "K";
                }
            }
        }

        System.out.println(Arrays.toString(newarraystr));
    }

    private static int[] chartoint(Character[] array) {
        int[] newarray = new int[13];

        for (int i = 0; i < array.length; i++) {
            if ((Character.isDigit(array[i]))) {
                newarray[i] = Integer.valueOf(array[i].toString());
            } else {
                if (array[i].toString().equals("A")) {
                    newarray[i] = 1;
                }
                if (array[i].toString().equals("T")) {
                    newarray[i] = 10;
                }
                if (array[i].toString().equals("J")) {
                    newarray[i] = 11;
                }
                if (array[i].toString().equals("Q")) {
                    newarray[i] = 12;
                }
                if (array[i].toString().equals("K")) {
                    newarray[i] = 13;
                }
            }
        }
        Arrays.sort(newarray);
        return newarray;
    }


}
