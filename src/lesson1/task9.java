package lesson1;

/**
 * Напишите метод который бы принимал время в секундах и возвращал форматированную строку.
 * Пример:
 * format(50); //вернёт "50 секунд""
 * format(90); //вернёт "1 минута 30 секунд"
 * format(3640); //вернёт "1 час 40 секунд"
 * format(-2); //вернёт "0 секунд"
 * format(0); //вернёт "0 секунд"
 */

public class task9 {

    public static void main(String[] args) {
        Integer[] array = {50, 61, 90, 188, 887, 3640, -2, 0, 8640, 25640};

        for (int i = 0; i < array.length; i++) {
            String str = getarray(array[i]);
            System.out.println(str);
        }
    }

    private static String getarray(Integer num) {
        String str = null;
        String hour = "";
        String minute = "";
        String second = "";

        if (num <= 0) {
            str = "0 секунд";
        } else {
            Integer ost1 = 3600 / num;
            if (ost1 < 1) {
                ost1 = num / 3600;

                hour = (ost1 > 1 && ost1 < 5) ? "часа" : "часов";
                if (ost1== 1) {
                    hour = "час";
                }

                hour = ost1 + " " + hour + " ";
            }

            Integer ost2 = 60 / (num % 3600);
            if (ost2 <= 1) {
                ost2 = (num % 3600) / 60;
                if (ost2 != 0) {
                    //minute = (ost2 == 1 && ost2 < 5) ? "минута" : "минуты";
                    minute = (ost2 == 1 && ost2 < 5) ? "минута" : "минуты";
                    if (ost2 > 4) {
                        minute = "минут";
                    }
                    minute = ost2 + " " + minute + " ";
                }
            }

            Integer ost3 = (num % 3600) % 60;
            if (ost3 >= 1) {
                // minute = (ost2 == 1 && ost2 < 5) ? "секунда" : "минуты";
                second = (ost3 == 1 && ost3 < 5) ? "секунда" : "секунды";
                if (ost3 > 4) {
                    second = "секунд";
                }

                second = ost3 + " " + second + " ";
            }
            str = hour + minute + second;
        }

        return str;
    }


}
