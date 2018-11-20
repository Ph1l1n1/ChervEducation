package lesson3;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Ваш сайт имеет большую аудиторию в Скандинавии и соседних странах.
 * Маркетинг считает, что было бы здорово приветствовать посетителей сайта на их родном языке.
 * К счастью, вы уже используете API, который определяет местоположение пользователя..
 * <p>
 * Задание:
 * Подумайте о способе хранения языков как enum. Языки перечислены ниже.
 * Напишите функцию «добро пожаловать», которая принимает параметр «язык» (всегда строка)
 * и возвращает приветствие - если оно есть в вашей базе.
 * Он должен иметь значение по умолчанию - английский язык, если язык отсутствует в базе или в случае недопустимого ввода.
 * <p>
 * База:
 * english: 'Welcome',
 * czech: 'Vitejte',
 * danish: 'Velkomst',
 * dutch: 'Welkom',
 * estonian: 'Tere tulemast',
 * finnish: 'Tervetuloa',
 * flemish: 'Welgekomen',
 * french: 'Bienvenue',
 * german: 'Willkommen',
 * irish: 'Failte',
 * italian: 'Benvenuto',
 * latvian: 'Gaidits',
 * lithuanian: 'Laukiamas',
 * polish: 'Witamy',
 * spanish: 'Bienvenido',
 * swedish: 'Valkommen',
 * welsh: 'Croeso'
 */

public class welcome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("You make some action, for example: english, czech and another lang");
             try {
                 Wtexts lang= Wtexts.valueOf(in.nextLine());
                 String welcome = lang.getWlc();
                 System.out.println(welcome);
             } catch (Exception ex) {
                 System.out.println(Wtexts.english.getWlc());
             }
        }
    }
}