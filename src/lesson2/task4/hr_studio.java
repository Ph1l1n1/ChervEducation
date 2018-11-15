package lesson2.task4;


import java.util.ArrayList;
import java.util.Scanner;

public class hr_studio {

    private static ArrayList<Department> listofdepts = new ArrayList<Department>();
    private static String[] depts = {"qa", "develop"};

    public static void main(String[] args) {
        System.out.println("Whatsap man?");
        System.out.println("Do you want to work a little?");

        // Инициализация
        Worker worker;
        for (int i = 0; i < depts.length; i++) {
            Department dept = new Department(depts[i]);
            listofdepts.add(dept);
            System.out.println("Department: " + depts[i]);
        }

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("You make some action, for example: add, move worker, search, remove, personst");
            switch (in.nextLine()) {

                case "add":
                    worker = info();
                    System.out.println("worker " + worker.getName() + " added");
                    break;

                case "remove":
                    System.out.println("Who should be removed ");
                    worker = removeinfo();
                    System.out.println("Worker " + worker.getName() + " removed" );
                    break;

                case "move worker":
                    worker = move();
                    System.out.println("worker " + worker.getName() + " moved, more info: " + worker.toString());
                    break;

                case "search":
                    System.out.println("Who should be search ?");
                    String name = in.nextLine();
                    worker = search(name);

                    if (worker != null) {
                        System.out.println("Info about worker: " + worker.toString());
                    } else {
                        System.out.println("No info about worker");
                    }
                    break;

                case "persons":
                    int sum = count();
                    System.out.println("in your organization : " + sum + " workers");
                    break;

                default:
                    System.out.println("i dont understand you mather fucker, repeat please donkey!!!");
                    break;

            }
        }


    }

    private static Worker info() {
        Scanner in = new Scanner(System.in);

        System.out.println("Insert name");
        String name = in.nextLine();
        System.out.println("Insert dept");
        String named = in.nextLine();
        System.out.println("Insert hour");
        int hour = Integer.parseInt(in.nextLine());
        System.out.println("Insert perhour");
        int percost = Integer.parseInt(in.nextLine());

        Worker worker = addworker(name, named, hour, percost);
        return worker;
    }

    private static Worker move() {
        Department dept = null;
        Worker worker = null;
        Scanner in = new Scanner(System.in);
        System.out.println("Whom we will move ?");
        String name = in.nextLine();
        System.out.println("Where we will move ?");
        String named = in.nextLine();

        worker = search(name);

        int hour = worker.getHour();
        int percost = worker.getPerhour();

        removeworker(name);
        worker = addworker(name, named, hour, percost);

        return worker;
    }

    private static Worker search(String name) {
        Worker worker = null;

        FOR1:
        for (int i = 0; (i < hr_studio.getListofdepts().size()); i++) {
            Department dept = hr_studio.getListofdepts().get(i);
            for (int j = 0; j < dept.getListofworker().size(); j++) {
                worker = dept.getListofworker().get(j);
                if (name.equals(worker.getName())) {
                    // i = hr_studio.getListofdepts().size();
                    break FOR1;
                }
            }
        }

        return worker;
    }

    private static Worker addworker(String name, String named, int hour, int percost) {
        Worker worker = new Worker(name, hour, percost);
        InsertToDept(worker, named);
        return worker;
    }

    private static Worker removeinfo() {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        Worker worker = removeworker(name);
        return worker;
    }

    private static Worker removeworker(String name) {
        Worker worker = null;

        worker = search(name);
        String named = worker.getDept().getNamed();

        for (int i = 0; i < hr_studio.getListofdepts().size(); i++) {
            Department dept = hr_studio.getListofdepts().get(i);
            if (named.equals(dept.getNamed())) {
                dept.RemoveFromListofworker(worker);
            }
        }

        return worker;
    }


    private static void InsertToDept(Worker worker, String named) {
        for (int i = 0; i < hr_studio.getListofdepts().size(); i++) {
            Department dept = hr_studio.getListofdepts().get(i);
            if (named.equals(dept.getNamed())) {
                dept.setListofworker(worker);

            }

        }

    }


    private static int count() {
        int sum = 0;

        for (int i = 0; i < hr_studio.getListofdepts().size(); i++) {
            sum = sum + hr_studio.getListofdepts().get(i).getListofworker().size();
        }

        return sum;
    }

    public static ArrayList<Department> getListofdepts() {
        return listofdepts;
    }

}


