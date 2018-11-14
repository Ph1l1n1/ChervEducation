package lesson2.task4;



import java.util.Scanner;

public class hr_studio {

    private int allworker = 0;
    private String[] depts = {"qa", "develop"};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            switch (in.nextLine()) {
                case "add":
                    System.out.println("Insert name, dept, hour, perhour");
                    String name = addworker();

                    System.out.println("worker " + name + " added");
                    break;
                case "remove":
                    System.out.println("remove worker");


                    break;
                case "search":


                    System.out.println("Info about worker");
                    break;
                case "persons":


                    System.out.println("in your organization : " + " workers");
                    break;
                default:
                    System.out.println("i dont understand you mather fucker, repeat please donkey!!!");
                    break;


            }
        }


    }

    private static String addworker() {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        String dept = in.nextLine();
        int hour = Integer.parseInt(in.nextLine());
        int percost = Integer.parseInt(in.nextLine());

        Worker worker = new Worker(name,dept,hour,percost);
        return name;

    }

}


