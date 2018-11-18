package lesson3;

import java.io.*;
import java.util.*;

public class out {

    /**
     * Напишите программу которая бы считывала Имена который пользователь забивал в консоль,
     * принимать данные до тех пор пока пользователь не напишет слова exit, quit или close
     * Все данные которые ввёл пользователь необходимо записать в файл в алфавитном порядке
     */

    public static void main(String[] args) throws IOException {

        ArrayList<String> arr = new ArrayList<>();
        FileWriter writer = new FileWriter("notes.txt", false);

        Scanner in = new Scanner(System.in);
        FOR1:
        while (true) {
            String str = in.nextLine();
            if ((str.equals("exit")) | (str.equals("qu♠it")) | (str.equals("close"))) {
                System.out.println("Прекращаем");
                Collections.sort(arr, Comparator.comparing(String::toString));

                for (int i = 0; i <arr.size() ; i++) {
                    writer.write(arr.get(i));
                }


                break FOR1;
            }
            arr.add(str);
        }

        System.out.println("3-4, закончили");

    }
}



