package lesson2.task4;

import java.util.ArrayList;

public class Department {

    private String named;
    private ArrayList<Worker> listofworker = new ArrayList<>();


    public Department(String named) {
        this.named = named;
        this.listofworker = listofworker;
        return;
    }

    public Department() {
    }

    public String getNamed() {
        return named;
    }


    public void setListofworker(Worker worker) {
        this.listofworker.add(worker);
        worker.setdept(this);
    }

    public void RemoveFromListofworker(Worker worker) {
        this.listofworker.remove(worker);
    }

    public ArrayList<Worker> getListofworker() {
        return listofworker;
    }

}
