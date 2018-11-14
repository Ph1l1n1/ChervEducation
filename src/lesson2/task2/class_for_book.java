package lesson2.task2;

public class class_for_book {

    public static void main(String[] args) {

        Author author = new Author();
        Book book = new Book("war and peace", author, 3434.2);
        System.out.println("author:"+ book.getAuthorName() + " email:" + book.getAuthorEmail());


        book.addNewAuthor("Bunin", "bunin@ma.ru", 'm');
        book.addNewAuthor("varvara", "varvara@ma.ru", 'f');
        System.out.println(book.toString());
    }


}
