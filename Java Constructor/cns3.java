import java.util.*;

//Question 1
class Cylinder {
    private int radius;
    private int height;

    public int getradius() {
        return radius;
    }

    public void setradius(int radius) {
        this.radius = radius;
    }

    public int getheight() { 
        return height;
    }

    public void setheight(int height) {
        this.height = height;
    }

    public double surfaceArea() {
        return  2 * Math.PI * radius * radius + 2 * 3.1416 * radius * height;
    }

    public double volume() {
        return  Math.PI * radius * radius * height;
    }
}

public class cns3 {
    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder();
        myCylinder.setheight(12);
        System.out.println(myCylinder.getheight());
        myCylinder.setradius(9);
        System.out.println(myCylinder.getradius());
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());

    }
}

