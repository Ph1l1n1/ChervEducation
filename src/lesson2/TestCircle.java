package lesson2;


import java.lang.reflect.Field;
import java.util.Hashtable;

public class TestCircle {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Circle c1 = new Circle();
        Field f1 = c1.getClass().getDeclaredField("color"); //NoSuchFieldException
        f1.setAccessible(true);
        System.out.println("color:" + f1.get(c1) + "   radius:" + c1.getRadius());


        Circle c2 = new Circle(3.33);
        f1 = c1.getClass().getDeclaredField("color"); //NoSuchFieldException
        f1.setAccessible(true);
        System.out.println("color:" + f1.get(c2) + "   area:" + c2.getArea());


        c2 = new Circle(10.88, "blue");
        System.out.println("color:" + c2.getColor() + "   area:" + c2.getArea());


        //Если мы не определили в классе метод toString(), то будет вызван метод toString() класса Object.
        //Когда мы пытаемся вывести Object, мы отображаем данные из classname@HashCode_in_Hexadeciaml_form.
        //Если нужна соответствующая информация об объекте с1, тогда нужно переопределить метод toString Java класса Object в классе с1
        System.out.println(c1.toString());
        System.out.println(c1);

    }


}

