package Inheritance;

import java.util.*;

class base {
    int x;

    public int  getx() {
        return x;
    }

    public void setx(int x) {
        System.out.println("I Am In Base And Setting x Now");
        this.x = x;
    }

    public void printMe() {
        System.out.println("I Am Constructor");
    }
}

class derived extends base {
    int y;

    public int gety() {
        return y;
    }

    public void sety(int y) {
        System.out.println("I AM In Derived And Setting y Now");
        this.y = y;
    }
}

public class inh1 {
    public static void main(String[] args) {
        //Creating An Object Of Base Class
        base b = new base();
        b.setx(4);
        System.out.println(b.getx());

        //Creating An Object Of Derived Class
        derived d = new derived();
        d.sety(15);
        System.out.println(d.gety());

        //You Can Also Set Base Attributes By Derived Objct
        // d.setx(11);
        // System.out.println(d.getx());
    }
}
