package lesson2.task2;


public class Class_fot_Author {
    public static void main(String[] args) {

        Author Author = new Author("Philip", "ilya@prosto.vru", 'm');
        System.out.println("name=" + Author.getName() + ",email=" + Author.getMail()+ ",gender="+ Author.getGender());

        Author.setName("Mary");
        System.out.println(Author.getName());

        Author.setMail("zbs@prost.com");
        System.out.println(Author.getMail());

        Author.setGender('f');
        System.out.println(Author.getGender());

        System.out.println("Метод toString " + Author.toString());
    }
}
