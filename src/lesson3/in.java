package lesson3;

import java.util.Scanner;

/**
 * Напишите программу которая бы считывала данные из консоли до тех пор пока пользователь не напишет слова exit, quit или close
 */
public class in {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        FOR1:
        while (true) {
            String str = in.nextLine();
            if ((str.equals("exit")) | (str.equals("quit")) | (str.equals("close"))) {
                System.out.println("Прекращаем");
                break FOR1;
            }
        }
        System.out.println("3-4, закончили");

    }
}
