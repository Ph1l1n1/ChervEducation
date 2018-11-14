package lesson2.task2;

import java.util.ArrayList;

/**
 * -- задание на композицию --
 * Напишите класс Book(который использует класс Author написанный в part1):
 * - Объявить 3 привытных переменных: name(String), author(Author предполагаются, что в книге только 1 автор),
 * price(double) а также геттер/сеттеры для них.
 * - Один публичный конструктор: (String name, Author author, double price).
 * - Написать метод toString() который вернёт краткую информацию о книге.
 * Вы должно повторно использовать toString() у экземпляра класса Author.
 * К примеру вывод будет такой:
 * Book[name=Полный порядок,Author[name=Эмили Граветт,email=em.gmail.com,gender=f],price=690]
 * <p>
 * Попытайтесь:
 * 1.) Создать экземпляр класса Book и вывести в консоль name и email автора книги.
 * 2.) Написать новые методы для класса Book называемые getAuthorName() и getAuthorEmail() и getAuthorGender()
 * чтобы вернуть name,email и gender автора.
 * 3.) Изменить Book класс для поддержки одного или нескольких авторов.
 */

public class Book {
    private String name;
    private Author author;
    private double price;
    private ArrayList<String> listofAuthor = new ArrayList<>();

    public Book(String name, Author author, double price) {
        this.name = name;
        this.price = price;
        this.author = author;
        listofAuthor.add(author.toString());

    }

    public String toString() {
        String infoofAuthors = "";

        for (int i = 0; i < listofAuthor.size(); i++) {
            infoofAuthors = infoofAuthors + listofAuthor.get(i);

        }

        return "Book{" +
                "name=" + name + ", " +
                infoofAuthors +
                ", price=" + price +
                '}';
    }


    public void addNewAuthor(String Author, String mail, char gender) {
        Author newauthor = new Author(Author, mail, gender);
        listofAuthor.add(newauthor.toString());
        //System.out.println(author.toString());
    }


    public String getAuthorName() {
        return author.getName();
    }
    public String getAuthorEmail() {
        return author.getMail();
    }
    public char getAuthorGender() {
        return author.getGender();
    }
}
