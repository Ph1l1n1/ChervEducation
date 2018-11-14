package lesson2.task2;

/**
 * -- задание на композицию --
 * Класс Author, предназначен для моделирования автора книги.
 *  Этот класс должен содержать:
 *      - Три приватных переменных: name(String), email(String) и gender(char ('m' или 'f'));
 *          и соответвтсвущие для них геттеры/сеттеры.
 *      - Один конструктор для инициализации name, email и gender переданными значениями.
 *      - Метод toString() который возвращает краткую инфомацию об экземпляре класса, к примеру:
 *          Author[name=Mayakovskiy,email=mayakovskiy@mail.ru,gender=m]
 * Напишите этот класс а также напишите второй класс который бы выводил значения всех публичных методов у класса Author.
 */


public class part1 {
    private String name;
    private String mail;
    private char gender;

    public static void main(String[] args) {




    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
