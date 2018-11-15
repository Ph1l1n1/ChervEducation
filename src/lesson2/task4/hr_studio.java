package lesson2.task4;


import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Scanner;

public class hr_studio {

    private static ArrayList<Department> listofdepts = new ArrayList<Department>();
    private static String[] depts = {"qa", "develop"};

    public static void main(String[] args) {
        System.out.println("Whatsap man?");
        System.out.println("Do you want to work a little?");

        // Инициализация отделов
        for (int i = 0; i < depts.length; i++) {
            Department dept = new Department(depts[i]);
            listofdepts.add(dept);
            System.out.println("Department: " + depts[i]);
        }

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("You make some action, for example: add, search, remove");
            switch (in.nextLine()) {
                case "add":
                    addworker();
                    break;

                case "remove":
                    removeworker();
                    break;

                case "search":
                    System.out.println("Who should be search ?");
                    Worker worker = search();

                    if (worker != null) {
                        System.out.println("Info about worker: " + worker.toString());
                    } else {
                        System.out.println("No info about worker");
                    }
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

    private static Worker search() {
        Worker worker = null;
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        FOR1: for (int i = 0; (i < hr_studio.getListofdepts().size()); i++) {
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

    private static void removeworker() {
        Worker worker = null;
        Scanner in = new Scanner(System.in);
        System.out.println("Who should be removed ");
        worker = search();
        String named =  worker.getDept().getNamed();

        for (int i = 0; i < hr_studio.getListofdepts().size(); i++) {
            Department dept = hr_studio.getListofdepts().get(i);
            if (named.equals(dept.getNamed())) {
                dept.RemoveFromListofworker(worker);
            }
        }

        System.out.println("remove worker");
    }

    private static void addworker() {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert name");
        String name = in.nextLine();
        System.out.println("Insert dept");
        String named = in.nextLine();
        System.out.println("Insert hour");
        int hour = Integer.parseInt(in.nextLine());
        System.out.println("Insert perhour");
        int percost = Integer.parseInt(in.nextLine());

        Worker worker = new Worker(name, hour, percost);
        InsertToDept(worker, named);

        System.out.println("worker " + name + " added");
    }

    private static void InsertToDept(Worker worker, String named) {
        for (int i = 0; i < hr_studio.getListofdepts().size(); i++) {
            Department dept = hr_studio.getListofdepts().get(i);
            if (named.equals(dept.getNamed())) {
                dept.setListofworker(worker);

            }

        }

    }


    public static ArrayList<Department> getListofdepts() {
        return listofdepts;
    }

}


