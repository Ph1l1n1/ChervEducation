package lesson2.task3;

import lesson2.task1.Circle;


/**/


public class Cylinder extends Circle {
    private double height = 1.0;


    public Cylinder() {
    }

    public Cylinder(double radius) {
        super.setRadius(radius);
    }

    public Cylinder(double radius, double height) {
        super.setRadius(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super.setRadius(radius);
        super.setColor(color);
        this.height = height;
    }


    public double getVolume() {
        double v = height * getRadius();
        return v;
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


}

