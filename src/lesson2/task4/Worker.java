package lesson2.task4;


public class Worker {

    private String name;

    private int perhour;

    private Department dept;

    public Worker(String name, int hour, int perhour) {
        this.name = name;
        this.hour = hour;
        this.perhour = perhour;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name=" + name +
                ", hour=" + hour +
                ", perhour=" + perhour +
                ", dept=" + getDept().getNamed() +
                '}';

    }

    public void setdept(Department dept) {
        this.dept = dept;
    }

    public Department getDept() {
        return dept;
    }

    public int getHour() {
        return hour;
    }

    private int hour;

    public int getPerhour() {
        return perhour;
    }
}
