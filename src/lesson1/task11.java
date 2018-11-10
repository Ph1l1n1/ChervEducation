package lesson1;

import java.util.Arrays;

/**
 * Дан n x n массив, верните массив элементов в порядке их расположения начиная от внешних элементов двигаясь к среднему перемещаясь по часовой стрелке.
 * Пример:
 * arr = [[1,2,3],
 * [4,5,6],
 * [7,8,9]] // вернёт [1,2,3,6,9,8,7,4,5]
 * arr = [] // вернёт []
 */

public class task11 {

    public static void main(String[] args) {
        //int[][] array = {{1, 2, 3}, {4, 5, 6,}, {7, 8, 9,}};
        //int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9,10,11, 12}, {13, 14, 15, 16}};
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};

        Integer num = 0;
        Integer x = -1;
        Integer y = 0;
        Integer corner = 1;

        Integer nums = (array.length * array.length);
        Integer level = array.length;
        Integer currentlevel = 0;

        for (int i = 0; i < nums; i++) {


            if (corner == 1) {
                x++;
                currentlevel = x + 1;
            }

            if (corner == 2) {
                y++;
                currentlevel = y + 1;
            }


            if (corner == 3) {
                x--;
                currentlevel = x;
            }


            if (corner == 4) {
                y--;
                currentlevel = y - 1;
            }


            num = array[y][x];
            if (currentlevel == level) {
                corner++;
            }
            if ((currentlevel == (array.length - level) & (corner == 3 | corner == 4))) {
                corner++;
            }

            if (corner == 5) {
                corner = 1;
                level--;

            }

            System.out.println(num);
        }
    }
}