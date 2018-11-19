package lesson3;

public class task1 {

    public static void main(String[] args) {
        // Напишите один единственый метод который бы умел складывать все чиловые типы данных
        Double aDouble = 10.2D;
        Float aFloat = 7.8F;
        Long aLong = 12L;
        Integer integer = 10;
        Short aShort = 12;
        Byte aByte = 127;

        double superint = sum(aDouble,aFloat,aLong,integer,aShort,aByte);
        System.out.println(superint);
    }

    private static double sum(Double aDouble, Float aFloat, Long aLong, Integer integer, Short aShort, Byte aByte) {
    double sum = 0;

    sum  = aDouble+aFloat+aLong+integer+aShort+aByte;


    return sum;
    }
}
